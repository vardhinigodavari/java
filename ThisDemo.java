import java.io.*;
class Student{
    int rollnumber;
    String Name;
    float Fee;
    Student(int rollnumber,String Name,float Fee)
    {
        rollnumber = rollnumber;
        Name = Name;
        Fee = Fee;
    }
    void display(){
        System.out.println("Student detals are ");
        System.out.println(rollnumber+" "+Name+" "+Fee);
    }
}
public class ThisDemo1{
    public static void main(String args[]){
        Student s1 = new Student(4224,"vardhini",45700);
        Student s2 = new Student(4225,"hema",45700);
        s1.display();
        s2.display();
    }
}
