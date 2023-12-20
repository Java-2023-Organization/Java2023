package lab4;

//todo check "final" key word
//todo nested==static vs. inner vs. embedded classes
public class Student {
    private String name;
    static private Main main;

    public static void main(String[] args) {
        main.main(new String[] {});
        Student student = new Student();
//        InternalMain main1;

//        todo check why it is needed??))) and what is the name of this case?
//        todo is it possible to use method/function inside other methode/function (except lambda case)
        class InternalMain {
            public static void main(String[] args) {
                System.out.println("InternalMain");
                Student student = new Student();
            }
        }

        InternalMain.main(new String[] {});
        InternalMain main2 = null;
        main2.main(new String[] {});
    }

    /*static void method() {
        main.Internal
    }*/

//    todo check why static is needed
    public /*static*/ class Main {
        public static void main(String[] args) {
            System.out.println("Main.main()");
            Student student = new Student();
        }
    }
}
