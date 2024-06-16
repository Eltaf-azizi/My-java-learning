class A{
    public void show() {
        System.out.println("in show: A");
    }
}

public class anonymousInnerClass {
    public static void main(String a[]) {
        A obj = new A();
        obj.show();
    }
}

