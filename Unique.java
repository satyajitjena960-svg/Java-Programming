package ARRAY;
import java.util.Scanner;
public class Unique {
    Scanner sc =new Scanner(System.in);
    int[]arr;
     int size;
     public Unique(int size){
        this.arr=new int [size];
     }
//    public void declare(){
//        System.out.println("enter the size of array");
//        size = sc.nextInt();
//        arr = new int[size];
//    }
    public void insert(){
        System.out.println("enter your elements");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
    }
    public void check(){
         int result=0;
         int b= arr.length;
        for (int i=0;i<arr.length;i++){
          int count=0;
            for (int j=0;j< arr.length;j++){
                if (arr[j]==arr[i]){
                   count++;


                }
            }
            if (count==1)
             result=arr[i];
            System.out.println(result);
        }


    }
    public static void main(String[] args) {
        Unique ob=new Unique(5);
//        ob.declare();
        ob.insert();
        ob.check();
    }
}
