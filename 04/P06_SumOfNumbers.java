import java.util.Scanner;

public class P06_SumOfNumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double input;

        for (int i = 1; i <= 5; i++) {
            input = scanner.nextDouble();
            sum += input;
        }
        System.out.println(sum);
    }
}
