


class Human {
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String i){
        name = i;
    }

}

public class Encapsulation {
    public static void main(String a[]){
        Human human = new Human();
        human.setAge(14); 
        human.setName("Farhan");
        System.out.println(human.getName() + " : " + human.getAge());
    }
}
