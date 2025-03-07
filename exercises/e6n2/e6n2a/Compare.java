package exercises.e6n2.e6n2a;

import java.util.Arrays;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        System.out.print("Please enter how many numbers you want to compare: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Please enter number " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("The smallest number is " + array[0]);
        System.out.println("The largest number is " + array[array.length - 1]);
    }
}