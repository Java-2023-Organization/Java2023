package lab4;

//todo check "final" key word
public class Student {
    private String name;
    static private Main main;

    public static void main(String[] args) {
        Student student = new Student();
        Main main1;

//        todo check why it is needed??))) and what is the name of this case?
//        todo is it possible to use method/function inside other methode/function (except lambda case)
        class Main {
            public static void main(String[] args) {
                Student student = new Student();
            }
        }
    }

//    todo check why static is needed
    /*static*/ class Main {
        public static void main(String[] args) {
            Student student = new Student();
        }
    }
}
