package ARRAY;

import java.util.Scanner;

public class SecondLargest {
    Scanner sc=new Scanner(System.in);
    int arr[];
    int capacity;
    public SecondLargest(int size){
        System.out.println("enter the size of the array");
        this.arr=new int[size];
    }
    public void insert(){
        System.out.println("enter the elements");
        for(int i = 0; i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void Max(){
        int max=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                 max=arr[i];

            }
        }
        System.out.println(max);
    }
    public void Second(){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i:arr){
            if (i>max1){
                max2=max1;
                max1=i;
            } else if (i>max2 && i!=max1) {
                max2=i;
                
            }
        }
        System.out.println(max2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        SecondLargest ob=new SecondLargest(size);
        ob.insert();
        ob.Max();
        ob.Second();

    }
}
