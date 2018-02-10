import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = Math.sqrt(b * b - 4 * a * c);
        double x1 = 0;
        double x2 = 0;

        if (discriminant == 0) {
            x1 = x2 = - b / 2 * a;
        } else if (discriminant > 0) {
            x1 = (- b + discriminant) / 2 * a;
            x2 = (- b - discriminant) / 2 * a;
        } else {
            System.out.println("No real roots.");
            return;
        }
        System.out.printf("x1 = %f%nx2 = %f", x1, x2);
    }
}
