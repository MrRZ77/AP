package exercises.E5_15;

import java.util.Scanner;

public class TaxEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income : ");
        float income = sc.nextFloat();
        float tax = 0;
        float finalIncome;
        if (income < 50000) {
            tax = income * 1 / 100;
        } else if (50000 <= income & income < 75000) {
            tax = income * 2 / 100;
        } else if (75000 <= income & income < 100000) {
            tax = income * 3 / 100;
        } else if (100000 <= income & income < 250000) {
            tax = income * 4 / 100;
        } else if (250000 <= income & income < 500000) {
            tax = income * 5 / 100;
        } else if (income >= 500000) {
            tax = income * 6 / 100;
        }
        else {
            System.out.println("please enter a valid number");
        }
        finalIncome = income - tax;
        System.out.println("Your income is " + income + " and tax is " + tax + "and your final income is " + finalIncome);
    }
}