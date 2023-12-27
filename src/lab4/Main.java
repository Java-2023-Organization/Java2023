package lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        todo try support group with minus character (or confirm that it is not possible)
        Student student =
                new Student("Oleksii", "Aleshchenko", 4.9f, Group.IO_61,
                        "FICT");
        Student student2 =
                new Student("Oleksii", "Aleshchenko", 4.9f, Group.IO62,
                        "FICT");

//        Group group = Group.valueOf("IO-61");

        Student[] students = {
            student,
            student2,
            new Student("Oleksii", "Aleshchenko", 4.7f, Group.IO62,
                    "FICT")
        };

        Object[] objects;

        objects = students;

        System.out.println(((Student) objects[0]).getGroup());

        Arrays.sort(students);

        System.out.println(student.compareTo(student2));

        System.out.println(Arrays.toString(students));

//        System.out.println(group.getName());

//        System.out.println(student2.group());
    }
}
