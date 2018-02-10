import java.util.Scanner;

public class P07_GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double greatestNumber = -(Double.MAX_VALUE);
        double input;


        for (int i = 1; i <= 5; i++) {
            input = Double.parseDouble(scanner.nextLine());
            if (input > greatestNumber) {
                greatestNumber = input;
            }
        }
        System.out.println(greatestNumber);
    }
}
