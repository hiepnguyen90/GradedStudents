package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList<>();



    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        Collections.addAll(examScores, testScores);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getNumberOfExamsTaken() {
        return examScores.size();
    }


    public String getExamScores() {
        String output = "";
        output += "Exam Scores:";
        for (int i = 0; i < examScores.size(); i++) {
            output += "\n      Exam" + (i + 1) + " -> " + examScores.get(i);
        }
        return output;
    }

    public void addExamScore(Double add) {
        examScores.add(add);
    }

    public void setExamScores(int index, double exam) {
        examScores.set(index, exam);
    }

    public double getAverageExamScore() {
        double sum = 0;
        for (double s : examScores) {
            sum = sum + s;
        }
        return sum/examScores.size();
    }

    public String toString(){
        String output = "";
        output = "Student Name: " + getFirstName() + "\n" + "> Average Score: " + getAverageExamScore() + "\n" + "> " + getExamScores();
        return output;
    }

}