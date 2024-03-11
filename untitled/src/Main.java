// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
aws-vault exec dev -- aws lambda add-permission --function-name "configparser-lambda" \
        --statement-id "s3invoke" --action "lambda:InvokeFunction" \
        --principal "s3.amazonaws.com" \
        --source-arn "arn:aws:s3:::aws-controltower-logs-136570571885-us-east-1" \
        --source-account "193494411491"

        aws s3api put-bucket-notification-configuration --bucket aws-controltower-logs-136570571885-us-east-1 \
        --notification-configuration '{
        "LambdaFunctionConfigurations": [
        {
        "LambdaFunctionArn": "arn:aws:lambda:us-west-1:355177271065:function:configparser-lambda",
        "Events": ["s3:ObjectCreated:*"],
        "Filter": {
        "Key": {
        "FilterRules": [
        {
        "Name": "suffix",
        "Value": ".gz"
        }
        ]
        }
        }
        }
        ]
        }'









        {
        "Version": "2012-10-17",
        "Statement": [{
        "Effect": "Allow",
        "Principal": {
        "Service": "s3.amazonaws.com"
        },
        "Action": "sns:Publish",
        "Resource": "arn:aws:sns:us-west-1:355177271065:config-s3-notifications",
        "Condition": {
        "ArnLike": { "aws:SourceArn": "arn:aws:s3:::aws-controltower-logs-136570571885-us-east-1" }
        }
        }]
        }