/**
 * My program for first laboratory work
 */
public class Lab1 {
    int a = 1;

    /**
     * Standard entry point (method) for Java
     *
     * Variant: 6101
     * O1: -
     * O2: /
     * i and j: char
     * C = 2
     *
     * @param args - standard arguments for passing values in Java program by console standard
     */
    public static void main(String[] args) {
//        todo think about low vs. capital letter
        final int a = 3;
        final int n = 4;
        final int b = 0;
        final int m = 2;

        final int C = 2;

//        todo char details
//        todo console input
        // todo char details + console input

//        todo think about low vs. capital letter

        if (a <= C && C <= n || b <= 0 && 0 <= m) {
            showErrorAndExit();
        }

        double S = 0;
        for (char i = a; i <= n; i++) {
            int denominator = i - C;
            for (char j = b; j <= m; j++) {
                S += (double)i/j/denominator;
            }
        }
        System.out.println("S = " + S);
    }

    private static void showErrorAndExit() {
        System.out.println("Error! Division by zero.");
        System.exit(1);
    }
}
