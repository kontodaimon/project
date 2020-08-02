package classes;

import java.util.List;

public class PerStudent {

    private Student student;
    private List<Assignment> assPerStudent;
    private List<Course> courPerStudent;

    public PerStudent() {
    }

    public PerStudent( List<Course> courPerStudent ,Student student) {
        this.student = student;
        this.courPerStudent = courPerStudent;
    }

    public PerStudent(Student student, List<Assignment> assPerStudent) {
        this.student = student;
        this.assPerStudent = assPerStudent;
    }

    public PerStudent(Student student, List<Assignment> assPerStudent, List<Course> courPerStudent) {
        this.student = student;
        this.assPerStudent = assPerStudent;
        this.courPerStudent = courPerStudent;
    }

    public void setCourPerStudent (Course cour){
        this.courPerStudent.add(cour);
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Assignment> getAssPerStudent() {
        return assPerStudent;
    }

    public void setAssPerStudent(List<Assignment> assPerStudent) {
        this.assPerStudent = assPerStudent;
    }

    public List<Course> getCourPerStudent() {
        return courPerStudent;
    }

    public void setCourPerStudent(List<Course> courPerStudent) {
        this.courPerStudent = courPerStudent;
    }

    @Override
    public String toString() {
        return "PerStudent{" + "student=" + student + ", assPerStudent=" + assPerStudent + ", courPerStudent=" + courPerStudent + '}';
    }

    

}
