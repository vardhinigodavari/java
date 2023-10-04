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
public class SingleInheritanceDemo{
    public static void main(String args[]){
        Dog D = new Dog();
        D.bark();
        D.eat();
    }
