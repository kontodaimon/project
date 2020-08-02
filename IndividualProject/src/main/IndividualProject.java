/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.Course;
import classes.Trainer;
import classes.Student;
import classes.Assignment;
import classes.AllPerCourse;
import classes.PerStudent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author demon
 */
public class IndividualProject {

    // arrayList for the new object
    static ArrayList<Student> studentList = new ArrayList();
    static ArrayList<Trainer> trainerList = new ArrayList();
    static ArrayList<Course> courseList = new ArrayList();
    static ArrayList<Assignment> assignmentList = new ArrayList();  //A list of all the assignments [5 marks]

    static ArrayList<AllPerCourse> APCList = new ArrayList();
    static ArrayList<PerStudent> PStudent = new ArrayList();

    static Map<Student, List<Assignment>> map1 = new HashMap<Student, List<Assignment>>();

    public static void main(String[] args) {
        // one scanner for all
        Scanner sc = new Scanner(System.in);

        message("whelcom to the program");

        // mainProgram(sc);
        defaultData();
        
          System.out.println(studentList);
//        
//         if(usersByCountry.containsKey(user.getCountry())) {
//        //Add to existing list
//        usersByCountry.get(user.getCountry()).add(user);
//
//        
        System.out.println(APCList);
        for (AllPerCourse allPerCourse : APCList) {
            for (Student student : studentList) {
                if (allPerCourse.getCourStudent().contains(student)) {
                     if (map1.containsKey(student)) {
                        map1.get(student).addAll(allPerCourse.getCourAssi());
               
                    } else {
                        map1.put(student, allPerCourse.getCourAssi());
                    }

                }
            }
        }
System.out.println("--------------------------");
        
        
        
        
        
        
        
        
        
        
        
//        for (Student student : studentList) {
//            for (AllPerCourse allPerCourse : APCList) {
//                if (allPerCourse.getCourStudent().contains(student)) {
//                    System.out.println(allPerCourse.getCourStudent());
//                    if (map1.keySet().contains(student)) {
//                        map1.get(student).addAll(allPerCourse.getCourAssi());
//
//                    }else {
//                    map1.put(student, allPerCourse.getCourAssi());
//                }
//
//                } 
//                //map1.put(student, allPerCourse.getCourAssi());
//            }
//        }
        for (Student i : map1.keySet()) {
            System.out.println("key: " + i.getFirstName() + "\n" + " value: " + map1.get(i).stream().map(a->a.getTitle()).collect(Collectors.toList()));
        }

//        for (int i = 0; i < APCList.size(); i++) {
//            System.out.println((1 + i) + "." + "Course: " + APCList.get(i).getCourse().getTitle() + APCList.get(i).getCourAssi());
//        }
        //System.out.println(map1);
//        outPut3a(studentList, APCList);
//        for (Student i : map1.keySet()) {
//            System.out.println("key: " + i.getFirstName() + "\n"+ " value: " + map1.get(i));
//        }
//        outPut3(studentList, APCList);
//        for (int i = 0; i < PStudent.size(); i++) {
//            System.out.println((1 + i) + "." + "Student : " + PStudent.get(i).getStudent().getFirstName() + " " + PStudent.get(i).getStudent().getLastName() + "\n" + PStudent.get(i).getAssPerStudent());
//        }
        // outPut2(sc);
        // outPut1(sc);
    }

    //****** methods ******************************************************
    //one to print only meseges
    public static void message(String mes) {
        System.out.println(mes);
    }

    //one method to take String
    public static String message(String mes, Scanner sc) {
        message(mes);
        String input = sc.next();
        return (input);
    }

    //one method to take integer
    public static Integer message2(String mes, Scanner sc) {
        message(mes);
        String input = sc.next();
        Integer inputIn = Integer.parseInt(input);
        return (inputIn);
    }

    // one method to print courses
    public static void coursePrint() {
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println((1 + i) + "." + courseList.get(i));
        }
    }

    //one method to take Date
    public static LocalDate message3(String mes, Scanner sc) {
        message(mes);
        String s = message("like 2020-05-31", sc);
        LocalDate date = LocalDate.parse(s);
        return date;

    }

    public static void mainProgram(Scanner sc) {
        Integer move = message2("Do you want to put info , take default info or nothing\nput 1, 2 or 3", sc);    //  The application must ask from the command prompt to input data to all the entities 
        if (move == 1) {
            addData(sc);
        } else if (move == 2) {                                                     //If the user decides not to type any data, the program should use synthetic data [5 marks].

            defaultData();

        } else if (move == 3) {
            defaultData();
        }
        move = message2("Do you want some output\n 1 for yes, 2 for no", sc);
        if (move == 1) {
            move = message2("Do you want a list of all or a compination\n put 1 or 2", sc);
            if (move == 1) {
                outPut1(sc);
            } else if (move == 2) {
                outPut2(sc);
            }

        } else if (move == 2) {

        }

    }

    //newTrainer
    public static void newTrainer(Scanner sc) {
        Trainer trainer = new Trainer(message("First name", sc), message("Last name", sc), message("Subject", sc));
        trainerList.add(trainer);
        message("In witch course is teaching\nput the number in the list");
        coursePrint();
        int enter = sc.nextInt();
        AllPerCourse aPC = new AllPerCourse(courseList.get(enter - 1), trainer);
        APCList.add(aPC);

    }

    //newStudent
    public static void newStudent(Scanner sc) {
        Student student = new Student(message("First name", sc), message("Last name", sc), message3("Give the birth date", sc), message2("Tuition Fees", sc));
        studentList.add(student);
        System.out.println(student);
        message("In witch course is enrolled\nput the number in the list");
        coursePrint();
        int enter = sc.nextInt();
        AllPerCourse aPC = new AllPerCourse(courseList.get(enter - 1), student);
    }

    //newCourse
    public static void newCourse(Scanner sc) {
        Course course = new Course(message("Give the title of the course", sc), message("Give the stream of the course", sc),
                message("Give the type of the course", sc), message3("Give the start date ", sc),
                message3("Give the end date ", sc));
        courseList.add(course);
        //assignment
    }

    // newAssignmet
    public static void newAssignmet(Scanner sc) {
        Assignment assignment = new Assignment(message("Give the title of the assigment", sc), message("Give the duscription of the assigment", sc), message3("Give the date of the submissions ", sc));
        assignmentList.add(assignment);
        message("For witch course is the assignmet\nput the number in the list");
        coursePrint();
        int enter = sc.nextInt();
        AllPerCourse aPC = new AllPerCourse(courseList.get(enter - 1), assignment);
        //assignment
    }

    // the add method
    public static void addData(Scanner sc) {
        String entry = message("How many entry do you want to do\nput a number ", sc);    //and it should give the option to add more than one entry at a time [10 marks]. 
        Integer numEntry = Integer.parseInt(entry);
        defaultData2();
        for (int i = 0; i < numEntry; i++) {
            entry = message("What do you want to enter\nAssignment, Course, Student or Trainer ?", sc);

            if (entry.toLowerCase().equals("trainer")) {
                newTrainer(sc);

            } else if (entry.toLowerCase().equals("student")) {
                newStudent(sc);

            } else if (entry.toLowerCase().equals("course")) {
                newCourse(sc);

            } else if (entry.toLowerCase().equals("assigment")) {
                newAssignmet(sc);

            }

        }
    }

    //default data 
    public static void defaultData() {

        LocalDate d = LocalDate.of(2020, 05, 02);
        LocalDate d2 = LocalDate.of(2020, 05, 05);
        LocalDate db = LocalDate.of(1996, 04, 15);
        LocalDate db2 = LocalDate.of(1985, 06, 06);
        LocalDate db3 = LocalDate.of(1980, 06, 30);
        LocalDate db4 = LocalDate.of(2020, 07, 17);
        LocalDate sd = LocalDate.of(2020, 07, 03);
        LocalDate sd2 = LocalDate.of(2020, 04, 27);

        Course c1 = new Course("CB11", "Java", "full", d, d2);
        Course c2 = new Course("CB11", "Java", "part", d, d2);
        Course c3 = new Course("CB11", "C#", "full", d, d2);
        Course c4 = new Course("CB11", "C#", "part", d, d2);
        courseList.add(c4);
        courseList.add(c3);
        courseList.add(c2);
        courseList.add(c1);

        Trainer t = new Trainer("Babis", "Sougias", "Math");
        Trainer t2 = new Trainer("Petros", "Petras", "Filosophi");
        trainerList.add(t);
        trainerList.add(t2);

        Student s = new Student("Kostas", "Kostakis", db, 1000);
        Student s2 = new Student("Giannhs", "Piou", db2, 1000);
        Student s3 = new Student("Markos", "Xlapatsas", db3, 1000);
        Student s4 = new Student("Babis", "Meraklis", db4, 1000);
        studentList.add(s);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        Assignment a = new Assignment("Cooking", "individual", sd);
        Assignment a2 = new Assignment("Writing", "team", sd2);
        Assignment a3 = new Assignment("Fishing", "team", sd2);
        assignmentList.add(a);
        assignmentList.add(a2);
        assignmentList.add(a3);

        AllPerCourse aPC1 = new AllPerCourse(c1, s4, t, a);
        aPC1.setCourStudent(s2);
        aPC1.setCourStudent(s);
        aPC1.setCourAssi(a2);
        AllPerCourse aPC2 = new AllPerCourse(c2, s, t2, a3);
//        aPC2.setCourStudent(s);
        aPC2.setCourTrainer(t);
        AllPerCourse aPC3 = new AllPerCourse(c3, s4, t, a);
        aPC3.setCourStudent(s3);
        aPC3.setCourAssi(a3);
        AllPerCourse aPC4 = new AllPerCourse(c4, s2, t2, a2);
        aPC4.setCourStudent(s3);
        aPC4.setCourTrainer(t);
        APCList.add(aPC4);
        APCList.add(aPC1);
        APCList.add(aPC2);
        APCList.add(aPC3);
    }

    public static void defaultData2() {
        LocalDate d = LocalDate.of(2020, 05, 02);
        LocalDate d2 = LocalDate.of(2020, 05, 05);

        Course c1 = new Course("CB11", "Java", "full", d, d2);
        Course c2 = new Course("CB11", "Java", "part", d, d2);
        Course c3 = new Course("CB11", "C#", "full", d, d2);
        Course c4 = new Course("CB11", "C#", "part", d, d2);

        courseList.add(c4);
        courseList.add(c3);
        courseList.add(c2);
        courseList.add(c1);
    }

    // output 1 the for list 
    //A list of all the students [5 marks]
    //A list of all the trainers [5 marks]
    //A list of all the courses [5 marks]
    //A list of all the assignments [5 marks]
    public static void outPut1(Scanner sc) {
        String entry = message("Which list do you want to print\nAssignment, Course, Student or Trainer ?", sc);
        if (entry.toLowerCase().equals("trainer")) {
            coursePrint();

        } else if (entry.toLowerCase().equals("student")) {
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println((1 + i) + "." + studentList.get(i));
            }

        } else if (entry.toLowerCase().equals("course")) {
            for (int i = 0; i < courseList.size(); i++) {
                System.out.println((1 + i) + "." + courseList.get(i));
            }

        } else if (entry.toLowerCase().equals("assigment")) {
            for (int i = 0; i < assignmentList.size(); i++) {
                System.out.println((1 + i) + "." + assignmentList.get(i));
            }

        }
    }

    //output 2 per course
//    All the students per course [10 marks]
//    All the trainers per course [10 marks]
//    All the assignments per course [10 marks]
    public static void outPut2(Scanner sc) {

        String entry = message("Which list per Course do you want to print\nAssignment, Student or Trainer ?", sc);

        if (entry.toLowerCase().equals("trainer")) {
            for (int i = 0; i < APCList.size(); i++) {
                System.out.println((1 + i) + "." + "Course: " + APCList.get(i).getCourse().getTitle() + "\n" + APCList.get(i).getCourTrainer());
            }

        } else if (entry.toLowerCase().equals("student")) {
            for (int i = 0; i < APCList.size(); i++) {
                System.out.println((1 + i) + "." + "Course: " + APCList.get(i).getCourse().getTitle() + APCList.get(i).getCourStudent());
            }

        } else if (entry.toLowerCase().equals("assignment")) {
            for (int i = 0; i < APCList.size(); i++) {
                System.out.println((1 + i) + "." + "Course: " + APCList.get(i).getCourse().getTitle() + APCList.get(i).getCourAssi());
            }

        }
    }

    //output 3 per student
//    All the assignments per student [10 marks] HINT: You need to relate a student per course and per assignment
//    A list of students that belong to more than one courses [10 marks]
    public static void outPut3(ArrayList<Student> listStudent, ArrayList<AllPerCourse> APCList) {
        List<PerStudent> result = new ArrayList<>();
        for (Student student : listStudent) {
            for (AllPerCourse allPerCourse : APCList) {

                //gia kathe mathiti se auto to course, an uparxei o mathitis student tote simenei pws
                //prepe na prostheseis ta assignments 
                for (Student courseStudent : allPerCourse.getCourStudent()) {
                    //ama exei to idio onoma kai epitheto
                    if (courseStudent.getFirstName().equals(student.getFirstName())
                            && courseStudent.getLastName().equals(student.getLastName())) {
                        //twra prepei na psaksoume an sto result exoume idi kataxorisei auton ton mathiti
                        //prepei na to kaneis pali me for 
                        for (PerStudent resultStudents : result) {//is emty h size ==0 
                            if (result.size() == 0) {
                                PerStudent perStudent = new PerStudent();
                                perStudent.setStudent(student);
                                perStudent.setCourPerStudent(allPerCourse.getCourse());
                                perStudent.setAssPerStudent(allPerCourse.getCourAssi());
                            } else if (resultStudents.getStudent().getFirstName().equals(student.getLastName())
                                    && resultStudents.getStudent().getLastName().equals(student.getLastName())) {
                                //ama vroume mathiti kanoume add all ola ta assgignments
                                resultStudents.getAssPerStudent().addAll(allPerCourse.getCourAssi());
                                resultStudents.getCourPerStudent().add(allPerCourse.getCourse());
                            } else {
                                //ama den vroume ftiaxnoume kainourgia eggrafi
                                PerStudent perStudent = new PerStudent();
                                perStudent.setStudent(student);
                                perStudent.setCourPerStudent(allPerCourse.getCourse());
                                perStudent.setAssPerStudent(allPerCourse.getCourAssi());
                            }
                        }
                    }
                }

//                if () {
//
//                    perStudent.setAssPerStudent(allPerCourse.getCourAssi());
//                    
//                    
//                } else if (allPerCourse.getCourStudent().contains(student)) {
//
//                    perStudent.setStudent(student);
//                    perStudent.setAssPerStudent(allPerCourse.getCourAssi());
//                    PStudent.add(perStudent);
//                }
//            
            }
        }
    }

    public static void outPut3a(ArrayList<Student> listStudent, ArrayList<AllPerCourse> APCList) {

        for (Student student : listStudent) {
            for (AllPerCourse allPerCourse : APCList) {

                map1.put(student, allPerCourse.getCourAssi());
            }
        }
    }

}
//output 3 per student
//    All the assignments per student [10 marks] HINT: You need to relate a student per course and per assignment
//    A list of students that belong to more than one courses [10 marks]
//    public static void outPut3(ArrayList<Student> listStudent, ArrayList<AllPerCourse> APCList) {
//           
//        for (Student student : listStudent) {
//
//            for (AllPerCourse allPerCourse : APCList) {
//
//                PerStudent perStudent = new PerStudent();
//                
//                if (allPerCourse.getCourStudent().contains(student)) {
//                    if (perStudent.getStudent().equals(perStudent.getStudent())){
//                        perStudent.setAssPerStudent(allPerCourse.getCourAssi());
//                    }
//                    perStudent.setStudent(student);
//                    perStudent.setAssPerStudent(allPerCourse.getCourAssi());
//                    PStudent.add(perStudent);
//                }
//                

//                if () {
//
//                    perStudent.setAssPerStudent(allPerCourse.getCourAssi());
//                    
//                    
//                } else if (allPerCourse.getCourStudent().contains(student)) {
//
//                    perStudent.setStudent(student);
//                    perStudent.setAssPerStudent(allPerCourse.getCourAssi());
//                    PStudent.add(perStudent);
//                }
//            
//            }
//
//        }
//        
//    }

