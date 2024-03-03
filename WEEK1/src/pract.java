import java.util.*;

public class pract {
    public static void main(String[] args) {
       int n;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the amount of numbers you want to enter");
       n = sc.nextInt();
       int [] arr = new int[n];
       System.out.println("Enter the numbers");
       for(int i = 0; i<n; i++){
           arr[i] = sc.nextInt();
       }
        int even = 0,odd = 0;
       for(int i = 0; i<n; i++){
           if(arr[i] % 2 == 0){
               even++;
           }
           else{
               odd++;
           }

       }
       System.out.println("Total number of Odd Numbers is " +odd +" and The total number of even numbers is " +even);

    }
}
