package exercises.E5_2;

import java.util.Scanner;

public class NumberEvaluator {
    public static void main(String[] args) {
        System.out.println("please enter the number:");
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        if (number < 0) {
            System.out.print("your number is negative");
            if (number > -1) {
                System.out.print(" and small.");
            } else if (number < -1000000) {
                System.out.print(" and large.");
            }
        } else if (number > 0) {
            System.out.print("your number is positive");
            if (number < 1) {
                System.out.print(" and small.");
            } else if (number > 1000000) {
                System.out.print(" and large.");
            }
        } else {
            System.out.println("your number is zero");
        }
    }
}