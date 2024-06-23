
class Laptop{
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Developer{
    public void devApp(Laptop lap){
        lap.code();
    }
}


public class needOfInterface {
    public static void main(String a[]){
        Laptop lap = new Laptop();

        Developer Eltaf = new Developer();
        Eltaf.devApp(lap);
    }
}
