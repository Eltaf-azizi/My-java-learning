

class Computer{
    public void playMusic(){
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost){
        if(cost >= 10)
            return "pen";
        else
            return "Your buget is low!";
    }
}

public class method {
    public static void main(String arg[]){

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);
    }
}
