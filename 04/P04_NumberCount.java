import java.util.Scanner;

public class P04_NumberCount {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int divByFiveCount = 0;
        int middleNumbers = num1;

        for (int i = (num1 + 1); i < num2; i++) {
            middleNumbers++;
            if (middleNumbers % 5 == 0) {
                divByFiveCount++;
            }
        }
        System.out.println(divByFiveCount);
    }
}
