// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1324));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;

        return sum;

    }
    }
