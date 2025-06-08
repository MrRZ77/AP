package exercises.E5_18;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String first = sc.nextLine();
        System.out.println("Enter the second string");
        String second = sc.nextLine();
        System.out.println("Enter the third string");
        String third = sc.nextLine();
        String[] words = {first, second, third};
        Arrays.sort(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}