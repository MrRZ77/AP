package exercises.e6n18;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        System.out.println("Please enter the side length of the diamond: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if ((i + j) >= (length + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= length; j++) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= length; j++) {
                if ((i + j) <= (length + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}