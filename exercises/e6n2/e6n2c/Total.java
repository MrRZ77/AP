package exercises.e6n2.e6n2c;

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        System.out.print("Please enter how many numbers you want compute cumulative totals of : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Please enter number " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
            System.out.print(total + " ");
        }
    }
}