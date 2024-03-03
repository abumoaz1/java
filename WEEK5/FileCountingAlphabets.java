package myPack1.WEEK5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCountingAlphabets {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("C:\\Users\\Moaz Khan\\Desktop\\FileHandling\\src\\source2.txt");
        int s = 0;
        int a;
        while((a=f.read()) != -1){
            s++;
        }
        System.out.println(s);
    }
}
