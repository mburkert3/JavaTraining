public class Main {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculateInterest(100.0, rate);
            if (interestAmount > 8.5) {
                break;
            }

            System.out.println("$100 at " + rate + "% interest = " + interestAmount);
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}


public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));

    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            return number % 2 != 0;
        }
        return false;
    }

    public static void sumOdd(int start, int end) {
        if ((end < start) || (start < 1) || (end < 1)) {
            return -1;

            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;

        }
    }
}