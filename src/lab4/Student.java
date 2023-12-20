package lab4;

public class Student {
    private String name;
    private String surname;
    private float averageMark;
    private Group group;
    private String faculty;

    public Student(String name, String surname, float averageMark, Group group, String faculty) {
        this.name = name;
        this.surname = surname;
        this.averageMark = averageMark;
        this.group = group;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public Group getGroup() {
        return group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
