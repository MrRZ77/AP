package exercises.e6n13;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the number you want to convert: ");
        int number = scanner.nextInt();
        while (number > 0) {
            System.out.println(number % 2);
            number = number / 2;
        }
    }
}