package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    @Test
    public void getExamScoresTest(){
        //Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double [] testScores = {100.0, 95.0, 123.0, 96.0};

        Student student = new Student(firstName, lastName, testScores);

        //when
        String output = student.getExamScores();
        String expected = "Exam Scores:\n" +
                "      Exam1 -> 100.0\n" +
                "      Exam2 -> 95.0\n" +
                "      Exam3 -> 123.0\n" +
                "      Exam4 -> 96.0";


        //then
        System.out.println(output);
        Assert.assertEquals(expected, output);

    }
    @Test
    public void addTest(){
        //Given
        String firstName = "Goku";
        String lastName = "Saiyan";
        Double [] testScores = { };

        Student student = new Student(firstName, lastName, testScores);


        //when
        student.addExamScore(100.0);
        String output = student.getExamScores();
        String expected = "Exam Scores:\n" +
                "      Exam1 -> 100.0";


        //then
        System.out.println(output);
        Assert.assertEquals(expected, output);


    }
    @Test
    public void setExamTest(){
        //Given
        String firstName = "Naruto";
        String lastName = "Uzumaki";
        Double [] testScores = {100.0};

        Student student = new Student(firstName, lastName, testScores);

        //when
        System.out.println(student.getExamScores());
        System.out.println();


        //alter examscores


        student.setExamScores(0, 150);;
        String output = student.getExamScores();
        String expected = "Exam Scores:\n" +
                "      Exam1 -> 150.0";


        //then
        System.out.println(output);
        Assert.assertEquals(expected, output);


    }
    @Test
    public void getAverageExamScore(){
        //Given
        String firstName = "Uchiha";
        String lastName = "Hiepdara";
        Double [] testScores = { 100.0, 150.0, 250.0, 0.0 };

        Student student = new Student(firstName, lastName, testScores);

        //when

        Double output = student.getAverageExamScore();
        Double expected = 125.0;


        //then
        System.out.println(output);
        Assert.assertEquals(expected, output);
    }

    @Test
    public void toStringTest(){
        //Given
        String firstName = "Adam";
        String lastName = "Rahzam";
        Double [] testScores = {100.0, 150.0, 250.0, 0.0};

        Student student = new Student(firstName, lastName, testScores);

        //when
        String output = student.toString();

        //then
        System.out.println(output);

    }


}