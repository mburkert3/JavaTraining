public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sumOfMatches = 0;
        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
            if (divisible(loopNumber)) {
                count++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match " + loopNumber);
                if (count == 5) {
                    break;

                }
            }

        }
        System.out.println("sum = " + sumOfMatches);


    }
    public static boolean divisible(int wholeNumber) {
        if ((wholeNumber % 3 == 0) && (wholeNumber % 5 == 0)) {
            return true;
        }
        return false;
    }

}
