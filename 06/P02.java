import java.util.Scanner;

public class P02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;

        while (i <= n) {
            boolean not3or7 = (i % 3 != 0) && (i % 7 != 0);
            if (not3or7) {
                System.out.println(i);
            }
            i++;
        }
    }
}
