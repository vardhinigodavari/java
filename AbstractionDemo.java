import java.io.*;
abstract class Animals{
    public abstract void AnimalSounds();
    public void Sleep(){
        System.out.println("zzzz");
    }
}
class Dog extends Animals{
    public void AnimalSounds(){
        System.out.println("The Dog sounds bow");
    }
}
public class AbstractionDemo{
    public static void main(String args[]){
        Dog d = new Dog();
        d.AnimalSounds();
        d.Sleep();
    }
}
    
