package myPack1.WEEK5;

import java.util.InputMismatchException;
import java.util.Scanner;

class OddAndEven{
    int countOfOdd = 0;
    int countOfEven = 0;
    void addNumber(int num){
        if((num % 2) != 0){
            countOfOdd++;
        }
        else{
            countOfEven++;
        }
    }
    public String toString(){
        return "Number of Odd: "+countOfOdd+"\nNumber of Even: "+countOfEven;
    }
}
public class Q1 {
    public static void main(String[] args) {
        OddAndEven obj = new OddAndEven();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
            String a;
            while(true){
                try{
                a = sc.next();
                if(a.equalsIgnoreCase("q")){
                    break;
                }
                obj.addNumber(Integer.parseInt(a));
                }
                catch (Exception e){
                    System.out.println("Invalid input");
                }
        }
        System.out.println(obj);

    }
}
