import java.util.Scanner;

public class Student {
    String name;
    int rollNumber;
    String address;

    public Student(String name, int rollNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    public void printAddress() {
        System.out.println("The Address of " + name + " with Roll Number " + rollNumber + " is" +address);
    }
}

