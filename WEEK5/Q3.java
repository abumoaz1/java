package myPack1.WEEK5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter text");
        String a = s.nextLine();
        StringTokenizer st = new StringTokenizer(a," ");
        System.out.println("Number of word : "+st.countTokens());
        StringTokenizer st2 = new StringTokenizer(a,".");
        System.out.println("The number of sentences: "+st2.countTokens());

        int countOfe = 0;
        int countOfz = 0;
            for(int i = 0; i<a.length(); i++){
                if(a.charAt(i) == 'e' || a.charAt(i) == 'E'){
                    countOfe++;
                }
                if (a.charAt(i) == 'z' || a.charAt(i) == 'Z'){
                    countOfz++;
                }
            }
        System.out.println("Total number of e in text: "+countOfe);
        System.out.println("Total number of z in text: "+countOfz);

    }
}
