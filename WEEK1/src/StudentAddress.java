import java.util.Scanner;

public class StudentAddress {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the Student: ");
        String name = sc.nextLine();

        System.out.println("Enter the Student Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Address of the Student: ");
        String address = sc.nextLine();

        Student student1 = new Student(name, rollNumber, address);
        student1.printAddress();
    }
}
