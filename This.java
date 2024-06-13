package Learning;


class Person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
public class This {
    public static void main(String a[]){
        Person person = new Person();
        System.out.println(person.getName() + " : " + person.getAge());
        
        person.setAge(20);
        person.setName("Hadi");
        
    }
}
