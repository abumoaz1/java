package myPack1.WEEK5;

import java.util.Scanner;

class Circle{
    double radius;
    double xcen;
    double ycen;
    Circle(double xcen,double ycen,double radius){
        this.xcen = xcen;
        this.ycen  = ycen;
        this.radius = radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }
    double perimeter(){
        return Math.PI*2*radius;
    }
    boolean coordinate(double x, double y){
        return Math.sqrt(Math.pow(xcen-x,2)+Math.pow(ycen-y,2)) <= radius;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the Radius of the circle ");
            double a = s.nextDouble();
            if (a < 0) {
                break;
            }
            System.out.println("Enter the coordinate of Center");
            double b = s.nextDouble();
            double d = s.nextDouble();
            Circle c = new Circle(b, d, a);
            System.out.println("Enter the coordinates to check");
            double e = s.nextDouble();
            double f = s.nextDouble();

            System.out.println(c.area());
            System.out.println(c.perimeter());
            System.out.println(c.coordinate(e, f));
        }
    }
}
