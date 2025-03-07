package exercises.e6n1a;

public class Evensum {
    public static void main(String[] args) {
        //question asked for between 2 and 100 not including them.
        int startingNumber = 2;
        int endingNumber = 100;
        int sum = 0;
        for (int i = startingNumber; i < endingNumber; i++) {
            sum += evenfinder(i);
        }
        System.out.println("The sum is: " + sum);
    }

    static int evenfinder(int number) {
        if (number % 2 == 0) {
            return number;
        } else {
            return 0;
        }
    }
}