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
        final int a = 1;
        final int n = 4;
        final int b = 1;
        final int m = 2;

        final int C = 2;

//        todo char details
//        todo console input
        // todo char details + console input

//        todo think about low vs. capital letter

        double S = 0;
        for (char i = a; i <= n; i++) {
            int denominator = i - C;
            if (denominator == 0) {
                showErrorAndExit();
            }
            for (char j = b; j <= m; j++) {
                if (j == 0) {
                    showErrorAndExit();
                }
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
