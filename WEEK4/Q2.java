package myPack1.WEEK4;

import java.util.Scanner;

class Combinations{
     void combination(int h){
        int A[] = new int[3];
        A[0] = h / 100;
        A[1] = (h / 10) % 10;
        A[2] = h % 10;
        for(int x : A){
            for(int y : A){
                for(int z : A){
                    if(x !=y && y != z && z != x){
                        System.out.print(x+""+y+""+z+" ");
                    }
                }
            }
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int a = s.nextInt();
        Combinations com = new Combinations();
        com.combination(a);
    }
}
