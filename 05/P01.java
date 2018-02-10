import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("Before:%na = %d%nb = %d%n%n", a, b);
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        System.out.printf("After:%na = %d%nb = %d", a, b);
    }
}
