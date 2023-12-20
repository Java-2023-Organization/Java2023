package lab4;

public class Main {
    public static void main(String[] args) {
//        todo try support group with minus character (or confirm that it is not possible)
        Student student =
                new Student("Oleksii", "Aleshchenko", 4.9f, Group.IO61,
                        "FICT");
        Student student2 =
                new Student("Oleksii", "Aleshchenko", 4.9f, Group.IO62,
                        "FICT");

        Group group = Group.valueOf("IO-61");
//        System.out.println(group.getName());

//        System.out.println(student2.group());
    }
}
