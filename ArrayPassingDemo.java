import java.io.*;
public class ArrayPassingDemo2{
    static void min(int arr[]){
        int m=arr[0];
        for(int i=1;i<arr.length;i++){
            if(m>arr[i]){
                m=arr[i];
            }
        }
        System.out.println("The minimum element is "+m);
    }
    public static void main(String args[]){
        int a[]={11,99,66,44,22};
        min (a);
    }
}
