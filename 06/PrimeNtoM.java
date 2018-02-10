import java.util.Scanner;

public class PrimeNtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        for (int num = n; num <= m; num++) {
            boolean prime = true;
            int divider = 2;
            while (divider <= (int) Math.sqrt(num)) {
                if (num % divider == 0) {
                    prime = false;
                    break;
                }
                divider++;
            }

            if (prime) {
                System.out.print(num + " ");
            }
        }
    }
}