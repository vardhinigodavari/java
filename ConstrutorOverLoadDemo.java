import java.io.*;
public class Square{
int s;
Square(){
s=5;
}
}
Square(int x){
s=x;
}
void arae(){
System,out,println("Area of the square is"+s*s);
}
}
class ConstructorOverloadDemo{
public static void main(String args[]){
square s1=new square();
square s2=new square(8);
s1.area();
s2.area();
}
}