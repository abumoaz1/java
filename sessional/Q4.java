package myPack1.sessional;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        String str = "I am living in Aligarh. Aligarh Muslim University is situated in Aligarh. Aligarh is famous for Lock industry.";
//        String [] A = str.split("\\.");
//        Arrays.sort(A);
//        for(String s : A){
//            System.out.print(s+".");
//        }
//        StringBuilder sb = new StringBuilder(str);
//        System.out.println(sb.reverse());
        String [] A = str.split("\\.");
        for(int i = A.length-1; i>=0; i--){
            System.out.print(A[i]+".");
        }
    }
}
