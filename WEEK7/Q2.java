package myPack1.WEEK7;
interface Interface1{
    void display1();
}
interface interface2{
    void display2();
}
class Demo implements Interface1,interface2{

    public void display(){
        this.display1();
        this.display2();
    }
    @Override
   public void display1(){
        System.out.println("Method of interface 1");
    }
    public void display2(){
        System.out.println("Method of interface 2");
    }
}
class Q2 {
    public static void main(String[] args) {
        Demo d = new Demo();
       d.display();
    }
}
