package myPack1.WEEK5;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = s.nextInt();
        boolean flag = true;
        for(int i =2; i<=n/2; i++){
            if(n % i == 0){
                flag = false;
                break;
            }
            else{
                flag = true;
            }
        }
        if(flag){
            System.out.println("Prime");
        }
        else {
            System.out.println("NOt a Prime");
        }
    }
}
