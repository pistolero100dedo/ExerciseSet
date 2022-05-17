package Entities;

public class Classes extends Students {

    private static final String[] classes = {"A", "B", "C"};


    public Classes() {
    }

    public Classes(Integer studentId){
        super(studentId);
    }

    public Classes(String name, Integer studentId) {
        super(name, studentId);
    }

    public static String[] getClasses() {
        return classes;
    }

}
