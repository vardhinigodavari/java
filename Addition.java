import java.io.*;
import java.util.*;
class Addition{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter first integer");
int i1=sc.nextInt();
System.out.println("enter second integer");
int i2=sc.nextInt();
int i3=i1+i2;
System.out.println("sum of "+i1+"and"+i2+"is"+i3);
}
}