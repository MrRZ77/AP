package exercises.e5n1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to sign identifier please enter the desired number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The number is positive");
        }
        else if (number < 0) {
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
    }
}