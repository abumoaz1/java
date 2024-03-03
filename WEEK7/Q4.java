package myPack1.WEEK7;
interface ShapeInterface{
   double area();
   double perimeter();
}
abstract class Shape implements ShapeInterface{

}
class Rectangle extends Shape{
    private final double length;
    private final double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
   public double area(){
        return length * breadth;
    }
    @Override
    public double perimeter(){
        return 2 * (length+ breadth);
    }
}
class Circle extends  Shape{
    private final double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
public double area(){
    return Math.PI * radius * radius;
}
@Override
public double perimeter(){
    return Math.PI*radius*2;
}
}
public class Q4 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(7,5);
        System.out.println("Area of Rectangle: "+r.area());
        System.out.println("Perimeter of Rectangle: "+r.perimeter());

        Circle c = new Circle(4);
        System.out.println("Area of Circle: "+c.area());
        System.out.println("Circumference of Circle: "+c.perimeter());
    }
}
