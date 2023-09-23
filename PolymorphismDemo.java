import java.io.*;
import java.util.*;
class Animal{
    public void AnimalSounds(){
        System.out.println("An Animal can make Sounds");
    }
}
class Cow extends Animal{
    public void AnimalSounds(){
        System.out.println("A cow sounds_maa");
    }
}
class Cat extends Animal{
    public void AnimalSounds(){
        System.out.println("A cat sounds_meow");
    }
}
public class PolymorphismDemo{
    public static void main(String args[]){
        Animal an = new Animal();
        Animal MyCow = new Cow();
        Animal MyCat = new Cat();
        an.AnimalSounds();
        MyCow.AnimalSounds();
        MyCat.AnimalSounds();
    }
}
