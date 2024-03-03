// package myPack1.sessional;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        String str = "we live in aligarh";
        String result = sortCharacters(str);
        System.out.println(result);
    }

    private static String sortCharacters(String sentence){
        String[] word = sentence.split("\\s");
        StringBuilder sb = new StringBuilder();

        for(String w : word){
            char [] c = w.toCharArray();
            Arrays.sort(c);
            sb.append(new String(c)).append(" ");
        }
        return sb.toString().trim();
    } 
}
