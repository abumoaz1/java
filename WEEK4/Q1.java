package myPack1.WEEK4;

class Fibonacci{
    Fibonacci(int n){
        int a = 0; int b = 1;
        int c = 0;
        do {
            System.out.print(a+" ");
            int temp = a + b;
            a =  b;
            b = temp;
            c++;
        }
        while (c < n);
    }
}
public class Q1 {
    public static void main(String[] args) {
       Fibonacci f = new Fibonacci(15);
    }
}
