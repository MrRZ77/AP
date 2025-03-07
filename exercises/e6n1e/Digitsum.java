package exercises.e6n1e;

import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter an integer number: ");
        int number = scanner.nextInt();
        while (number != 0) {
            sum += oddfinder(number % 10);
            number = number / 10;
        }
        System.out.println("Sum of the digits is: " + sum);
    }

    static int oddfinder(int number) {
        if (number % 2 != 0) {
            return number;
        } else {
            return 0;
        }
    }
}