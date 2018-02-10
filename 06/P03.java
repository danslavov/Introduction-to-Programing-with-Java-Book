import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numberCount; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.printf("Minimum = %d%nMaximum = %d", min, max);
    }
}
