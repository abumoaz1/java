package myPack1.WEEK7;

import java.util.Scanner;

class Q1{
    public static void main(String[] args) {
        String str = "We% live! in Aligarh";
        String [] arr = str.split("\\b");
        for(String s : arr){
            if(s.matches("\\w+")){
                StringBuilder sb = new StringBuilder(s);
                System.out.print(sb.reverse());
            }
            else {
                System.out.print(s);
            }
        }
    }
}

