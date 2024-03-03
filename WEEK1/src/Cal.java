public class Cal {
    public static void main(String[] args) {
       float re = div(3,5);
       System.out.println(re);
    }
    static int sum(int a , int b){
        return a+b;
    }
    static int sub(int a , int b){
        return a-b;
    }
    static int mul(int a , int b){
        return a*b;
    }
    static float div(float a , float b){
        if(b == 0){
            System.out.println("Undefined");
        }
        return a / b;
    }


}
