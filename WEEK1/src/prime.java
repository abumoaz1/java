import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        boolean ans = isPrime(y);
        System.out.println(ans);
    }
    public static boolean isPrime(int x){
        if(x <= 1){
            return false;
        }
        int a = 2;
        while(a * a <= x){
            if(x % a == 0){
                return false;
            }
            a++;
        }
        return a * a > x;
    }
}
