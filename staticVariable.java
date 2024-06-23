

class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "Phone";
        System.out.println("in static block");
    }


    public Mobile(){
        brand = "";
        price = 200;
        name = "Phone";
        System.out.println("in constructor");

    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class staticVariable {
    public static void main(String a[]){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1700;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();

        obj1.show();
        obj2.show();


        Mobile.show1(obj1);
    }
}
