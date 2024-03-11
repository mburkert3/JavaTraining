/*
 * Copyright (c) 2022-present Sonatype, Inc. All rights reserved.
 * "Sonatype" is a trademark of Sonatype, Inc.
 */
@Library(['private-pipeline-library', 'jenkins-shared']) _

        String role = 'repo-external-id'
        String accountId = '355177271065'
        String imageName = 'hashicorp/terraform'
        String terraformVersion = '1.3.5'

        terraformFlags = [
        normal : '',
        refresh: '-refresh-only',
        destroy: '-destroy'
        ]

        properties([
        disableConcurrentBuilds(),
        parameters([
        booleanParam(defaultValue: false, description: 'If checked will reload Jenkinsfile only.', name: 'reload'),
        choice(
        choices: ["staging"],
        name: 'environment',
        description: 'The environment to run in.'
        ),
        choice(
        choices: ["normal", "refresh", "destroy"],
        name: 'planningMode',
        description: 'The terraform planning mode.'
        ),
        choice(
        choices: ["1", "2"],
        name: 'nodesToDrop',
        description: 'Number of nodes to drop.'
        ),
        string(
        defaultValue: '4',
        description: 'Duration (in hours) for which to drop the nodes.',
        name: 'nodeDropDuration'
        )
        ])
        ])

        dockerizedRunPipeline(
        agentLabel: 'zion-small',
        retentionPolicy: RetentionPolicy.TEN_BUILDS,
        pathToDockerFile: 'Jenkins/dockerfile',
        dockerContextPath: 'Jenkins',
        run: {
        // ... (other parts of the run block)
        else {
        withAwsRole(credentialsId: 'repo-external-id', role: 'jenkins', roleAccount: '355177271065', region: 'us-west-1', duration: 3600) {
        withCredentials([string(credentialsId: 'datadog_api_key', variable: 'api_key'), string(credentialsId: 'app_key', variable: 'app_key')]) {
        dir("alarms/staging") {
        sonatypeZionGitConfig()
        timeout(time: 3600, unit: 'SECONDS') {
        sh '''
        terraform init
        terraform plan -var="nodes_to_drop=${params.nodesToDrop}"
        terraform apply -var="nodes_to_drop=${params.nodesToDrop}"
        '''
        // Dropping the first node
        if (params.nodesToDrop == '1') {
        sh "aws ec2 stop-instances --instance-ids i-0903d3ff13eb43ec0"
        sleep time: params.nodeDropDuration.toInteger() * 60 * 60, unit: 'SECONDS'
        sh "aws ec2 start-instances --instance-ids i-0903d3ff13eb43ec0"
        }

        // Dropping the second node
        else if (params.nodesToDrop == '2') {
        sh "aws ec2 stop-instances --instance-ids i-0a4795da68866a04e"
        sleep time: params.nodeDropDuration.toInteger() * 60 * 60, unit: 'SECONDS'
        sh "aws ec2 start-instances --instance-ids i-0a4795da68866a04e"
        }

        archiveArtifacts artifacts: '**/terraform.plan', allowEmptyArchive: true
        }
        }
        }
        }
        }
        )


        variable "AWS_ACCESS_KEY_ID" {
        description = "AWS Access Key"
        sensitive = true
        }

        variable "AWS_SECRET_ACCESS_KEY" {
        description = "AWS Secret Access Key"
        sensitive = true
        }