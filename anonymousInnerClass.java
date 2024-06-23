abstract class A{
    public abstract void show();
}



public class anonymousInnerClass {
    public static void main(String a[]) {
        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}

