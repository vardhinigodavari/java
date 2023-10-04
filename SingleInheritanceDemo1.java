import java.io.*;
class Animal{
    void eat(){
        System.out.println("Animal can eat ");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark ");
    }
}
class Babydog extends Dog{
    void weep(){
        System.out.println("Babydog can weep");
    }
}
public class SingleIheritanceDemo1{
    public static void main(String args[]){
        Dog D = new Dog();
        D.bark();
        D.eat();
        Babydog B = new Babydog();
        B.weep();
    }
}
