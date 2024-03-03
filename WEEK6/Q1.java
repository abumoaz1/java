package myPack1.WEEK6;

import java.util.Scanner;

class Grader{
    int score;
    Grader(int score){
        this.score = score;
    }
    String letterGrade(int score){
        if(score >= 90){
            return "A+";
        } else if (score >= 85) {
            return "A";
        } else if (score >= 80) {
            return "B+";
        } else if (score >= 75) {
            return "B";
        } else if (score >=65) {
            return "C+";
        } else if (score >= 60) {
            return  "C";
        } else if (score >= 55) {
            return "D+";
        } else if (score >= 50) {
            return "D";
        }
        else {
            return "F";
        }
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        if(num < 0 || num >100){
            System.out.println("Invalid score");
        }
        else{
            Grader grader = new Grader(num);
            String grade = grader.letterGrade(num);
            System.out.println("The grade is: "+grade);
        }
    }
}
