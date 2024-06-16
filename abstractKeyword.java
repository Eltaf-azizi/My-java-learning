
abstract class Car{
    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing music");
    }
}
abstract class wagonR extends Car{
    public void drive() {
        System.out.println("Driving..");
    }

}

class updatedwagonR extends wagonR{
    public void fly() {
        System.out.println("Flying..");
    }
}


public class abstractKeyword {
    public static void main(String a[]) {
        Car obj = new updatedwagonR();
        obj.drive();
        obj.playMusic();
    }
}
