package io.zipcoder;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Classroom {

    Student[] students;
    int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudents){
      students = new Student[maxNumberOfStudents];

    }

    public Classroom(Student[] student){
        students = student;

    }

    public Classroom(){
        students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore(){
        double sum = 0;
        for(Student s: students){
            sum += s.getAverageExamScore();
        }
        return sum/students.length;
    }

    public void addStudent(Student student){
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null){
                students[i] = student;
                break;
            }
        }
        /*int num = 0;

        for(Student s: students){
            if(s == null) {
                students[num] = student;
                break;
            }
            num++;

        }
        */

    }

    public void removeStudent(String firstName, String lastName){
        for(int i = 0; i< students.length; i++){
            if(students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)){
                students[i] = null;
            }

        }

    }

    public Student[] getStudentsByScore(Student[] students){
        Collections.sort(students,
                Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName).thenComparing(Student::getAverageExamScore));
    }
}
