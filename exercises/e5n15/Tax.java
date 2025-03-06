package exercises.e5n15;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        System.out.println("Please enter your salary");
        Scanner scanner = new Scanner(System.in);
        float salary = scanner.nextFloat();
        double tax = 0;
        double income = 0;
        if (salary > 0) {
            if (salary < 50000) {
                tax = salary * 0.01;
                income = salary - tax;
            } else if (salary >= 50000 && salary < 75000) {
                tax = salary * 0.02;
                income = salary - tax;
            } else if (salary >= 75000 && salary < 100000) {
                tax = salary * 0.04;
                income = salary - tax;
            } else if (salary >= 100000 && salary < 250000) {
                tax = salary * 0.04;
                income = salary - tax;
            } else if (salary >= 250000 && salary < 500000) {
                tax = salary * 0.04;
                income = salary - tax;
            } else if (salary >= 500000) {
                tax = salary * 0.04;
                income = salary - tax;
            }
            System.out.println("The salary is : " + salary + " The income is : " + income + " The tax is : " + tax);
        } else if (salary == 0) {
            System.out.println("no salary wish you a better year.");

        } else {
            System.out.println("Please enter a valid salary.");
        }
    }
}