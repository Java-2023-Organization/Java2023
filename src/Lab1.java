import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * My program for first laboratory work
 */
public class Lab1 {
    /**
     * Standard entry point (method) for Java
     * <p>
     * Variant: 6101
     * O1: -
     * O2: /
     * i and j: char
     * C = 2
     *
     * @param args - standard arguments for passing values in Java program by console standard
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        do {
            System.out.print("Please enter a number: ");
            try {
//                todo check inner functionality in scope of InputMismatchException case
                x = scanner.nextInt();
            } catch (InputMismatchException e) {
//                todo !!!!!!!!!!!!!! check hasNextInt method
//                todo check methods next vs nextLine
//                scanner.next();
                scanner.nextLine();
                System.out.println("You entered not a number!");
            }
            System.out.println(x);
        } while (x != -123);
//        todo think about low vs. capital letter
//        todo console input for int -2 and cast to char
        final int a = -2;
        System.out.println((char) a);
        final int n = 4;
        final int b = 1;
        final int m = 2;

        final int C = 2;

//        todo char details
//        todo console input
        // todo char details + console input

//        todo think about low vs. capital letter

        if (a <= C && C <= n || b <= 0 && 0 <= m) {
            System.out.println("Error! Division by zero.");
        } else {
            double S = 0;
//            todo check case with negative values
            for (char i = (char) a; i <= n; i++) {
                int denominator = i - C;
                for (char j = b; j <= m; j++) {
                    S += (double) i / j / denominator;
                }
            }
            System.out.println("S = " + S);
        }
    }
}
