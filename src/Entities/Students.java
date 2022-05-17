package Entities;

import java.util.Objects;

public class Students {

    private String name;
    private Integer studentId;

    public Students() {

    }

    public Students(Integer studentId) {
        this.studentId = studentId;
    }

    public Students(String name, Integer studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(studentId, students.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
