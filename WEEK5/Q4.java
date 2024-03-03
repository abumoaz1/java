package myPack1.WEEK5;

import java.util.Scanner;

class Commission{
    int sale;
     Commission(int sale){
        this.sale = sale;
    }
    double commission(int sale){
        if(sale < 500){
            return sale * 0.02;
        } else if (sale <= 5000) {
            return sale * 0.05;
        }
        else {
            return sale * 0.08;
        }
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount of sales ");
        int sales = sc.nextInt();
        if(sales <= 0){
            System.out.println("Invalid Input !!!  Sales cannot be negative ");
        }
        else{
            Commission c = new Commission(sales);
            System.out.println("Commission is: Rs."+c.commission(sales));
        }
    }
}
