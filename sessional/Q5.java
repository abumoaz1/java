package myPack1.sessional;

class Product{
    private String p_company;
    private String p_name;

    Product(String p_company, String p_name){
        this.p_company = p_company;
        this.p_name = p_name;
    }
    public String getP_company(){
        return p_company;
    }
    public String getP_name(){
        return p_name;
    }

}
class Bag extends Product{
    private String B_type;
    Bag(String a, String b,String B_type){
        super(a,b);
        this.B_type = B_type;
    }
}
public class Q5 {
    public static void main(String[] args) {
        Bag b1 = new Bag("WoodLand","Shoes","Leather");
        Bag b2 = new Bag("Bata","Shoes","Leather");
        Bag b3 = new Bag("Skecher","Shoes","Leather");
        System.out.println(b1.getP_company());
        System.out.println(b2.getP_company());
        System.out.println(b3.getP_company());


    }
}
