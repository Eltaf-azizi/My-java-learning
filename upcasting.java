
class A {
    public void show1() {
        System.out.println("in A show");
    }

    void show2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class B extends A{
    public void show2() {
        System.out.println("in B show");
    }
}

public class upcasting {
    public static void main(String a[]) {
        
        A obj = new B();
        obj.show1();

    }
}
