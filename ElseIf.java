import java.io.*;
import java.util.*;
public class ElseIf{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter marks of 3 subjects");
int s1=sc.nextInt();
int s2=sc.nextInt();
int s3=sc.nextInt();
int total=s1+s2+s3;
float avg=total/3;
System.out.println("The total marks of student is"+total);
if(avg>=75)
{
System.out.println("student avg is"+avg+"student passed with distinction");
}
else if(avg>=60&&avg<75)
{
System.out.println("student avg is"+avg+"student passed in first class");
}
else if(avg>=50&&avg<60)
{
System.out.println("student avg is"+avg+"student passed in second class");
}
else if(avg>=40&&avg<50)
{
System.out.println("student avg is"+avg+"student passed in third class");
}
else
{
System.out.println("student is failed");
}
}
}