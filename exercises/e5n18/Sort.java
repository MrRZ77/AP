package exercises.e5n18;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        String[] string = new String[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < string.length; i++) {
            System.out.print("please enter string number " + (i + 1) + ": ");
            string[i] = scanner.next();
        }
        Arrays.sort(string);
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]);
        }
    }
}
