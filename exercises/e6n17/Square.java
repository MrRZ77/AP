package exercises.e6n17;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Please enter the length of the square : ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = 1; j <= length; j++) {
                if (j == length || j == 1 || i == length || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}