import java.io.*;
interface Drawable{
    void Draw();
}
class Rectangle implements Drawable{
    public void Draw(){
        System.out.println("Drawing a rectangle");
    }
}
class Circle implements Drawable{
    public void Draw(){
        System.out.println("Drawing a circle");
    }
}
public class DemoInterface{
    public static void main(String args[]){
        Drawable d = new Circle();
        d.Draw();
        Drawable D = new Rectangle();
        D.Draw();
    }
}
