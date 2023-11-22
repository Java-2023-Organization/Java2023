public class Lab3 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("ASD");

        StringBuffer stringBuffer = new StringBuffer("ASD");

        stringBuilder.append("Q");
        stringBuffer.append("Q");

        stringBuffer.append(1);

        String s1 = "AS";
        System.out.println(s1.substring(1));
        System.out.println(s1.indexOf('S'));
        String s2 = s1;
        s1 += "D";
        System.out.println(s2); //ASD?

        int a = 0;
//        if (a = 1)
        /*System.out.println(a = 1);
        System.out.println(a == 0);*/
        System.out.println(s1 == s2);

        s1 = new String("ASD");
        s2 = new String("ASD");
//        s2 = "ASD";
        System.out.println("s1 == s2: " + (s1 == s2));// true
        System.out.println(s1.equals(s2));// true
//        todo StringPool
    }
}
