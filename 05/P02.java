import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a < 0 ^ b < 0) {
            System.out.println("-");
        } else {
            System.out.println("+");
        }
    }
}
