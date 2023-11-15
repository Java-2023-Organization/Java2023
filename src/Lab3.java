public class Lab3 {
    public static void main(String[] args) {
        String s1 = "ASD";
        String s2 = s1;
//        s1 += "Q";
        System.out.println(s2); //ASD?

        int a = 0;
//        if (a = 1)
        /*System.out.println(a = 1);
        System.out.println(a == 0);*/
        System.out.println(s1 == s2);

        s1 = new String("ASD");
        s2 = new String("ASD");
        System.out.println(s1 == s2);// true
//        todo StringPool
    }
}
