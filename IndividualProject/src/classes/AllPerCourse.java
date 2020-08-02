/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author demon
 */
public class AllPerCourse {

    private Course course;
    private List<Student> courStudent;
    private List<Trainer> courTrainer;
    private List<Assignment> courAssi;

    public AllPerCourse(Course course, Student courStudent) {
        this.course = course;
        this.courStudent = new ArrayList();
        this.courStudent.add(courStudent);
    }

    public AllPerCourse(Course course, Trainer courTrainer) {
        this.course = course;
        this.courTrainer = new ArrayList();
        this.courTrainer.add(courTrainer);
    }

    public AllPerCourse(Course course, Assignment courAssi) {
        this.course = course;
        this.courAssi = new ArrayList();
        this.courAssi.add(courAssi);
    }

    public AllPerCourse(Course course, Student courStudent, Trainer courTrainer, Assignment courAssi) {
        this.course = course;
        this.courStudent = new ArrayList();
        this.courStudent.add(courStudent);
        this.courTrainer = new ArrayList();
        this.courTrainer.add(courTrainer);
        this.courAssi = new ArrayList();
        this.courAssi.add(courAssi);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getCourStudent() {
        return courStudent;
    }

    public void setCourStudent(Student courStudent) {
        this.courStudent.add(courStudent);
    }

    public List<Trainer> getCourTrainer() {
        return courTrainer;
    }

    public void setCourTrainer(Trainer courTrainer) {
        this.courTrainer.add(courTrainer);
    }

    public List<Assignment> getCourAssi() {
        return courAssi;
    }

    public void setCourAssi(Assignment courAssi) {
        this.courAssi.add(courAssi);
    }

    @Override
    public String toString() {
        return "AllPerCourse{" + "course=" + course + ", courStudent=" + courStudent + ", courTrainer=" + courTrainer + ", courAssi=" + courAssi + '}';
    }

    
}
