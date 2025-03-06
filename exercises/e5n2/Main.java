package exercises.e5n2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to sign identifier please enter the desired number: ");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        if (number > 0) {
            System.out.println("The number is positive");
            if (number < 1){
                System.out.println("small");
            }
            else if (number > 1000000){
                System.out.println("large");
            }
        }
        else if (number < 0) {
            System.out.println("The number is negative");
            if (-number < 1){
                System.out.println("small");
            }
            else if (-number > 1000000){
                System.out.println("large");
            }
        }
        else{
            System.out.println("The number is zero");
        }
    }
}