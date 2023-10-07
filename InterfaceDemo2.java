import java.io.*;
interface Printable{
    void print();
}
public class InterfaceDemo implements Printable{
    public void print(){
        System.out.println("Method body");
    }
    public static void main(String args[]){
        InterfaceDemo id = new InterfaceDemo();
        id.print();
    }
}
