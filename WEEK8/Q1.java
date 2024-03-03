package myPack1.WEEK8;
class Person{
    String name;
    int yearOfBirth;
}
class Student extends Person{
    String major;
    Student(String name, int yearOfBirth, String major){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.major = major;
    }
    public String toString(){
        return "Name of Student: "+name+"\nYear of Birth: "+yearOfBirth+"\nMajor: "+major;
    }
}
class Instructor extends Person{
    double salary;
    Instructor(String name, int yearOfBirth, double salary){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }
    public String toString(){
        return "Name of the Instructor: "+name+"\nYear Of Birth: "+yearOfBirth+"\nSalary: "+salary;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Student s = new Student("Abu Moaz",1998,"Computer Science");
        System.out.println(s);
        Instructor i = new Instructor("Khan",1995,150000);
        System.out.println(i);
    }
}
