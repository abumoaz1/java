package myPack1.WEEK4;


import java.util.Scanner;

public class Q3 {

    static void sum(int w,int x, int y, int z){
        System.out.println(w + x + y + z);
    }
    static void product(int w, int x, int y, int z){
        System.out.println(w * x * y * z);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sum(a,b,c,d);
        product(a,b,c,d);
    }
}
