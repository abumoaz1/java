package myPack1.WEEK6;

import java.util.Scanner;

class Student{
   private String name;
   private double totalScore;
   private int numberOfQuizzes;

    public Student(String name, double score){
        this.name = name;
        totalScore = score;
    }
    public Student(double score, String name){
        totalScore = score;
        this.name = name;
    }
    public Student(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double getAverage(){
        if (numberOfQuizzes > 0){
            return totalScore / numberOfQuizzes;
        }
        else {
            return 0;
        }
    }
    public double getTotalScore(){
        return totalScore;
    }
    public void addQuiz(double score){
        numberOfQuizzes++;
        totalScore += score;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Student st1 = new Student("Abu Moaz");
        for(int i = 0; i<3; i++){
            
        }
    }
}
