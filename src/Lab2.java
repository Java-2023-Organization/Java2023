import java.util.Arrays;

public class Lab2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] a2 = new int[4];
        a2[0] = 1;
        a2[1] = 2;
        a2[2] = 3;
        a2[3] = 5;
        System.out.println(a == a2);
        System.out.println(Arrays.equals(a, a2));
    }
}
