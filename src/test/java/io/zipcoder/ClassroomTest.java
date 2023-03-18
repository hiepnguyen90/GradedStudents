package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void getAverageExamScoreTest() {
        //given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);


        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        //when

        double output = classroom.getAverageExamScore();
        double expected = 125.0;

        //then

        System.out.println(output);
        Assert.assertEquals(expected, output, 0);
    }

    @Test
    public void addStudentTest(){

        //given

        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Leon", "Hunter", examScores);
        classroom.addStudent(student);

        //when




        //classroom.addStudent(student);

        Student[] preEnrollment = new Student[0];
        Student[] postEnrollment = classroom.getStudents();


        Student[] expected = new Student[] {student};
        Student[] actual = classroom.getStudents();

        Assert.assertEquals(expected,actual);




        //then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);


        System.out.println("========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("========================");
        System.out.println(postEnrollmentAsString);


    }
    @Test
    public void removeStudent(){
        //given
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Leon", "Hunter", examScores);

        Double[] examScores2 = {100.0, 150.0, 250.0, 0.0};
        Student student2 = new Student("Leon2", "Hunter2", examScores);

        //when
        classroom.addStudent(student);
        classroom.addStudent(student2);
        System.out.println(classroom.getStudents());

        classroom.removeStudent("Leon", "Hunter");

        Student[] actual = classroom.getStudents();
        Student[] expect = {null, student2};


        //then

        Assert.assertEquals(expect, actual);


    }
}

