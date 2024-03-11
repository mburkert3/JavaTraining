public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Matt");
        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are met");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");

        }
        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");

        }
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
        double var1 = 20.00d;
        double var2 = 80.00d;
        double total = (var1 + var2) * 100.00d;

        System.out.println("myValuesTotal = " + total);
        double remainder = total % 40.00d;
        System.out.println("The remainder = " + remainder);
        boolean isTrue = (remainder == 0) ? true : false;
        System.out.println("remainder = " + isTrue);
        if (!isTrue) {
            System.out.println("Got some remainder");
        }

        }

    }


sh '''
        aws configure set aws_access_key_id ${AWS_ACCESS_KEY_ID}
        aws configure set aws_secret_access_key ${AWS_SECRET_ACCESS_KEY}
        aws configure set default.region us-west-1
        aws configure set default.output json
        '''





        if (params.nodesToDrop == '1' || params.nodesToDrop == '2') {
        withCredentials([
        string(credentialsId: 'AWS_ACCESS_KEY_ID', variable: 'AWS_ACCESS_KEY_ID'),
        string(credentialsId: 'AWS_SECRET_ACCESS_KEY', variable: 'AWS_SECRET_ACCESS_KEY')
        ]) {