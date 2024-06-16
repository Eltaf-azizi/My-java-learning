

class Student{
    int rollno;
    String name;
    int marks;
}
public class arrayOfObject{
    public static void main(String a[]){

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Haider";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Daanesh";
        s2.marks = 73;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Eltaf";
        s3.marks = 89;


        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}