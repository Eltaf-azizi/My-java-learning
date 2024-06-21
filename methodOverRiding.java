

class Calc{
    public int add(int n1, int n2){
        return n1*n2;
    }
}


class AdvCalc extends Calc{
    @Override
    public int add(int n1, int n2) {
        return n1+n2+4;
    }
}


public class methodOverRiding {
    public static void main(String a[]){
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}
