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
        l: for (char i = a; i <= n; i++) {
            for (char j = b; j <= m; j++) {
                if (j == 0 || i - C == 0) {
                    System.out.println("Error! Division by zero.");
                    System.exit(1);
//                    return;
//                    break l;
                }
                S += (double)i/j/(i - C);
            }
        }
        System.out.println("S = " + S);

//                System.out.println(123);

        /*int x = 1 + 2 *//*+ a*//*;
        if (a < 3) {
            int y = n + 3;
            System.out.println(y);
        }
        System.out.println(x);*/

        /*for (int i = 2; i > 1; i--) {

        }*/

        /*int a; // оголошення змінної (declaration)
        a = 1; // ініціалізація змінної (initialization)
        int b = 1; // оголошення та ініціалізація змінної*/

        /*System.err.println("RESULT:");
        System.out.println(args[2]);
        System.out.println("\u001B[35m123123");

        String s = "ASD";
        System.out.println(s.substring(1));*/
    }
}
