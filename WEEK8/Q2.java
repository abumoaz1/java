package myPack1.WEEK8;
class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee(){

    }
    Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
class Manager extends Employee{
    private double bonus;
    Manager(double bonus,int id, String name, String department, double salary){
        super(id,name,department,salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus + getSalary();
    }

    @Override
    public String toString() {
        return "Employee id: "+getId()+"\nName of Employee: "+getName()+"\nDepartment: "+getDepartment()+"\nMaximum Salary: "+getBonus();
    }
}
public class Q2 {
    public static void main(String[] args) {
        Manager m = new Manager(3000,12,"Moaz","CS",75000);
        System.out.println(m);
    }
}
