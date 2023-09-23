import java.io.*;
class Shape{}
class Rectangle extends Shape{}
class Square extends Shape{}
class Rhombus extends Square{}
class Animals {
    String name;
    public void eat()
    {
        System.out.println("i can eat");
    }
}
class JerryMouse extends Animals{
    public void display(){
        System.out.println("My name is "+name);
    }
}
public class InheritanceDemo{
    public static void main(String args[]){
        JerryMouse jm = new JerryMouse();
        jm.name="jerry_the mouse";
        jm.display();
        jm.eat();
    }
}
