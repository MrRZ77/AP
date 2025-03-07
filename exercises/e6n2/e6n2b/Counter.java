package exercises.e6n2.e6n2b;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        System.out.print("Please enter how many numbers you want to count the odds and evens : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int evencounter = 0;
        int oddcounter = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Please enter number " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        for (int element : array) {
            if (element % 2 == 0) {
                evencounter++;
            } else {
                oddcounter++;
            }
        }
        System.out.print("There are a total of " + evencounter + " even numbers and " + oddcounter + " odd numbers : ");
    }
}