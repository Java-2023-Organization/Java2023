package lab4;

public enum Group {
    IO_61("IO-61"),
    IO62("IO-62");

    private String name;

    Group(String name) {
        this.name = name;
//        super(name, 1);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    /*Group(String s) {

    }*/
}
