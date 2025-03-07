package exercises.e6n1a;

public class Evensum {
    public static void main(String[] args) {
        int startingNumber = 2;
        int endingNumber = 100;
        int sum = 0;
        for (int i = startingNumber; i < endingNumber; i = i + 2) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
