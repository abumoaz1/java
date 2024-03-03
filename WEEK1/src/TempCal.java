public class TempCal {

    public static double temp(double farenheit){
        double celsius = (5.0/9.0) * (farenheit - 32);
        return celsius;
    }
    public static void main(String [] args){
       System.out.println(temp(50));
    }
}
