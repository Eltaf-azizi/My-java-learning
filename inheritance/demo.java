package Learning.inheritance;

public class demo {
    public static void main(String a[]) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4, 8);
        int r2 = obj.sub(8, 2);
        int r3 = obj.multi(4, 3);
        int r4 = obj.div(12, 2);
        double r7 = obj.pow(3, 9);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r7);
    }
}

