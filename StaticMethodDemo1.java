import java.io.*;
class Student{
    int rollnumber;
    String name;
    static String college="SITE";
    static void Changecollege(){
        college="SASI";
    }
    Student(int r,String n){
            rollnumber=r;
            name=n;
        }
        void display(){
            System.out.println(rollnumber+" "+name+" "+college);
        }
    }
    public class StaticMethodDemo1{
        public static void main(String args[]){
            Student s1=new Student(4224,"hindu");
            Student s2=new Student(4225,"teja");
            System.out.println("Student details are");
            s1.display();
            Student.Changecollege();
            s2.display();
        }
    }
