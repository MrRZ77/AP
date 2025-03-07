package exercises.e6n2.e6n2d;

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        System.out.print("Please enter how many numbers you want to enter : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Please enter number " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < (n - 1); i++) {
            if (array[i] == array[i + 1]) {
                counter++;
            } else {
                if (counter > 0) {
                    System.out.print(array[i] + " ");
                    counter = 0;
                }
            }
        }
        if (counter > 0) {
            System.out.print(array[n - 1] + " ");
        }
    }
}