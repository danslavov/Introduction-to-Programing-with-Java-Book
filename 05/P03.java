import java.util.Scanner;

public class P03 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        String largest;
        if (a > b) {
            if (a > c) {
                largest = "a";
            } else {
                largest = "c";
            }
        } else {
            if (b > c) {
                largest = "b";
            } else {
                largest = "c";
            }
        }

//        System.out.println(Math.max(Math.max(a, b), c));  -- друг вариант

        System.out.println("Largest is " + largest);



    }
}
