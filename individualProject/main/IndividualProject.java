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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.time.DayOfWeek;
 
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
    static Map<Student, List<Assignment>> map1 = new HashMap<Student, List<Assignment>>();
    static List<Student> moreThanLesson = new ArrayList();
    static List<Student> subStudentWeek = new ArrayList();

    public static void main(String[] args) {
        // one scanner for all

//        *****************************************************
        Scanner sc = new Scanner(System.in);

        message("whelcom to the program");
        mainProgram2(sc);

//        ********************************************************* 

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
            System.out.println((1 + i) + "." + courseList.get(i).getTitle() + " " + courseList.get(i).getStream() + " " + courseList.get(i).getType() + " time");
        }
        System.out.println("-----------------------");
    }

    //one method to take Date
    public static LocalDate message3(String mes, Scanner sc) {
        message(mes);
        String s = message("like 2020-05-31", sc);
        LocalDate date = LocalDate.parse(s);
        return date;

    }
//  The application must ask from the command prompt to input data to all the entities 

    public static void mainProgram2(Scanner sc) {
        Integer move;
        do {
            System.out.println("1. Put info");
            System.out.println("2. Take default data");
            System.out.println("3. Take outputs");
            System.out.println("4. Check for date");
            System.out.println("0. Exit");
            move = message2("Put a number", sc);

            switch (move) {
                case 1:
                    addData(sc);
                    break;
                case 2:
                    defaultData();
                    break;
                case 3:

                    move = message2("Do you want a list of all entities or compinations\n put 1 or 2", sc);
                    if (move == 1) {
                        outPut1(sc);
                    } else if (move == 2) {
                        outPut2(sc);
                    }
                    break;
                case 4:
//                    defaultData();
                    subDate(sc);
                    break;

            }
        } while (move != 0);
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
        move = message2("Do you want some list outputs or to check assigmnet\n 1 for yes, 2 for no", sc);
        if (move == 1) {
            move = message2("Do you want a list of all entities or compinations\n put 1 or 2", sc);
            if (move == 1) {
                outPut1(sc);
            } else if (move == 2) {
                outPut2(sc);
            }

        } else if (move == 2) {
            defaultData();
            subDate(sc);

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

    }

    // newAssignmet
    public static void newAssignmet(Scanner sc) {
        Assignment assignment = new Assignment(message("Give the title of the assigment", sc), message("Give the duscription of the assigment", sc), message3("Give the date of the submissions ", sc));
        assignmentList.add(assignment);
        message("For witch course is the assignmet\nput the number in the list");
        coursePrint();
        int enter = sc.nextInt();
        AllPerCourse aPC = new AllPerCourse(courseList.get(enter - 1), assignment);

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

            } else if (entry.toLowerCase().equals("assignment")) {
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
        LocalDate sd3 = LocalDate.of(2020, 05, 4);

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
        Assignment a3 = new Assignment("Fishing", "team", sd3);
        assignmentList.add(a);
        assignmentList.add(a2);
        assignmentList.add(a3);

        AllPerCourse aPC1 = new AllPerCourse(c1, s4, t, a);
        aPC1.setCourStudent(s2);
        aPC1.setCourStudent(s);
        aPC1.setCourAssi(a2);
        AllPerCourse aPC2 = new AllPerCourse(c2, s, t2, a3);
        aPC2.setCourStudent(s2);
        aPC2.setCourTrainer(t);
        AllPerCourse aPC3 = new AllPerCourse(c3, s4, t, a);
        aPC3.setCourStudent(s3);
        aPC3.setCourAssi(a3);
        AllPerCourse aPC4 = new AllPerCourse(c4, s2, t2, a2);
//        aPC4.setCourStudent(s3);
        aPC4.setCourTrainer(t);

        APCList.add(aPC1);
        APCList.add(aPC2);
        APCList.add(aPC3);
        APCList.add(aPC4);

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
            for (int i = 0; i < trainerList.size(); i++) {
                System.out.println((1 + i) + "." + trainerList.get(i).getFirstName() + " " + trainerList.get(i).getLastName());
            }
            System.out.println("-----------------------");

        } else if (entry.toLowerCase().equals("student")) {
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println((1 + i) + "." + studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
            }
            System.out.println("-----------------------");

        } else if (entry.toLowerCase().equals("course")) {
            coursePrint();

        } else if (entry.toLowerCase().equals("assignment")) {
            for (int i = 0; i < assignmentList.size(); i++) {
                System.out.println((1 + i) + "." + assignmentList.get(i).getTitle());
            }
            System.out.println("-----------------------");

        }
    }

    //output 2 per course
//    All the students per course [10 marks]
//    All the trainers per course [10 marks]
//    All the assignments per course [10 marks]
    //PRINT output3
    public static void outPut2(Scanner sc) {
        outPut3(studentList, APCList);
        int entry2 = message2("Do you want list per Course or per Student?\nput 1 or 2", sc);
        if (entry2 == 1) {
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
        } else if (entry2 == 2) {
            entry2 = message2("Assignment per Student or Student with more than one Courses\nput 1 or 2", sc);
            if (entry2 == 1) {
                for (Student i : map1.keySet()) {
                    System.out.println("key: " + i.getFirstName() + "\n" + " value: " + map1.get(i).stream().map(a -> a.getTitle()).collect(Collectors.toList()));
                }
            } else if (entry2 == 2) {
                for (Student student : moreThanLesson) {
                    System.out.println(student);
                }
            }
        }

    }

    //output 3 per student 
    //MAKE ALL UNDER
//    All the assignments per student [10 marks] HINT: You need to relate a student per course and per assignment
//    A list of students that belong to more than one courses [10 marks]
    public static void outPut3(ArrayList<Student> studentList, ArrayList<AllPerCourse> APCList) {

        for (AllPerCourse allPerCourse : APCList) {
            for (Student student : studentList) {
                if (allPerCourse.getCourStudent().contains(student)) {
                    if (map1.containsKey(student)) {

                        map1.get(student).addAll(allPerCourse.getCourAssi());
                        if (!moreThanLesson.contains(student)) {
                            moreThanLesson.add(student);
                        }
                    } else {
                        map1.put(student, (ArrayList) ((ArrayList<Assignment>) allPerCourse.getCourAssi()).clone());
                    }
                }
            }
        }
    }

//    Lastly, the program should ask from the user a date and it should output a list of students
//    who need to submit one or more assignments on the same calendar week as the given date [15 marks].
    public static void subDate(Scanner sc) {
        LocalDate check = message3("Give a date for check", sc);
        DayOfWeek k = DayOfWeek.from(check);
        switch (k.getValue()) {
            case 1:
                LocalDate end = check.plusDays(5);
                LocalDate start = check.minusDays(1);
                subStudentAdd(start, end);

                break;
            case 2:
                end = check.plusDays(4);
                start = check.minusDays(2);
                subStudentAdd(start, end);

                break;
            case 3:
                end = check.plusDays(3);
                start = check.minusDays(3);
                subStudentAdd(start, end);

                break;
            case 4:
                end = check.plusDays(2);
                start = check.minusDays(4);
                subStudentAdd(start, end);

                break;
            case 5:
                end = check.plusDays(1);
                start = check.minusDays(5);
                subStudentAdd(start, end);

                break;
            case 6:
                end = check;
                start = check.minusDays(6);
                subStudentAdd(start, end);

                break;
            case 7:
                end = check.minusDays(1);
                start = check.minusDays(7);
                subStudentAdd(start, end);

                break;

        }

    }

    //helper for **subDate**
    public static void subStudentAdd(LocalDate start, LocalDate end) {
        outPut3(studentList, APCList);
        for (Student name : map1.keySet()) {
            List<Assignment> ass = map1.get(name);
            for (int i = 0; i < ass.size(); i++) {
                if (ass.get(i).getSubDateTime().isAfter(start) && ass.get(i).getSubDateTime().isBefore(end)) {
                    if (!subStudentWeek.contains(name)) {
                        subStudentWeek.add(name);
                    }
                }
            }

        }
        for (Student student : subStudentWeek) {
            System.out.println(student.getFirstName());

        }
    }
}
