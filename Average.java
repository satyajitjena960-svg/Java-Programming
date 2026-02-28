package ARRAY;

import java.util.Scanner;
public class Average {
    Scanner sc =new Scanner(System.in);
    double[]arr;
    static int size;

    public Average(int size) {

        this.arr=new double [size];
    }
//    public void declare(){
//        System.out.println("enter the size of array");
//        size = sc.nextInt();
//        arr = new double[size];
//    }
    public void insert(){
        System.out.println("enter your elements");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
    }
    public void avrage(){
        double sum=0;

        for (int i=0;i< arr.length;i++){
             sum=sum+arr[i];
        }
        double avg=sum/(arr.length);
        System.out.println("The average of the elemetnts are "+avg);
        sc.close();
    }

    public static void main(String[] args) {
        Average ob=new Average(5);
//        ob.declare();
        ob.insert();
        ob.avrage();

    }



}
