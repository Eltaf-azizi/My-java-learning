

class Calc{
    // final, method
    public final void show() {
        
        System.out.println("in A Show");
    }
    // final, class
    final public void add(int a, int b){
        System.out.println(a*b);
    }
}







public class Final{
    public static void main(String a[]) {

        //final, variable
        final int num = 1;
        num = 4;
        System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(4, 7);
    }
}

