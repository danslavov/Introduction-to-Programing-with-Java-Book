import java.util.Scanner;

public class P13_PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= (a - 1); i++) {
            if (a % i == 0) {
                a = 0;
            }
        }
        System.out.println((a != 0) ? "prime" : "composite");
    }
}
