package myPack1.WEEK7;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        String str1 = "Charlie";
        String str2 = "Able";
        String str3 = "Banker";
        String [] A = {str1,str2,str3};
        Arrays.sort(A);
        for(String s : A){
            System.out.print(s+" ");
        }

//        if(str1.compareTo(str2)>0){
//            String temp = str1;
//            str1 = str2;
//            str2 = temp;
//        }
//        if(str1.compareTo(str3) > 0){
//            String temp = str1;
//            str1 = str3;
//            str3 = temp;
//        }
//        if(str2.compareTo(str3) > 0){
//            String temp = str2;
//            str2 = str3;
//            str3 = temp;
//        }
//        System.out.print(str1+" "+str2+" "+str3);
    }
}
