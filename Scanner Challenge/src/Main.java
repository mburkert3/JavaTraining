import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sumNumbers = 0;

        try {
            System.out.println(getInputFromConsole(sumNumbers));
        } catch (NullPointerException e) {
            System.out.print(getInputFromScanner(sumNumbers));
        }
    }

    public static String getInputFromConsole(int sumNumbers) {
        String firstNum = System.console().readLine("Hello, enter a number");
        System.out.println("Thank you, enter the second number");

        String secondNum = System.console().readLine("Enter #2");

        String thirdNum = System.console().readLine("Enter #3");
        System.out.println("Thank you, enter the fourth number");

        sumNumbers = Integer.parseInt((firstNum + secondNum + thirdNum));

        return "Total is " + sumNumbers;

    }

    public static String getInputFromScanner(int sumNumbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, enter a number");
        String firstNum = scanner.nextLine();
        System.out.println("Thank you, enter the second number");
        String secondNum = scanner.nextLine();
        System.out.println("Thank you, enter the third number");
        String thirdNum = scanner.nextLine();


        Integer.parseInt(firstNum);
        Integer.parseInt(secondNum);
        Integer.parseInt(thirdNum);

        sumNumbers = Integer.parseInt((firstNum + secondNum + thirdNum));
        return "Total is " + sumNumbers;

    }
}