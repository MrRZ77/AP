import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double AC_GRAVITY = 9.81;
        System.out.print("Welcome to gravitational potential calculator please enter the mass of the object in kilograms : ");
        Scanner scanner = new Scanner(System.in);
        double mass = scanner.nextDouble();
        System.out.print("Please enter the height of the object in meters : ");
        double height = scanner.nextDouble();
        double mgh = mass * height * AC_GRAVITY;
        System.out.println("The gravitational potential energy is : " + mgh + " joules");
    }
}
