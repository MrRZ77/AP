package exercises.E6_1_a;

public class EvenNumberCounter {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i=i+2){
            sum += i;
        }
        System.out.println("sum of the even numbers between 2 and 100 is: " + sum);
    }
}
