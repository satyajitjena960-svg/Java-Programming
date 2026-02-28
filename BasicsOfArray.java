package ARRAY;

import java.util.Scanner;

public class BasicsOfArray {
    Scanner sc = new Scanner(System.in);
    int sum=0;
    int size;
 int[] arr;
public void size(){
    System.out.println("enter size");
//    Scanner sc = new Scanner(System.in);
    int size=sc.nextInt();
    arr=new int[size];
}

    public void Insert(){
        System.out.println("enter elements");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public void display(){
        System.out.println("array elements are");
        for (int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void sum(){
        System.out.println("the sum of array elements are");
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        BasicsOfArray object = new BasicsOfArray();


        object.size();
        object.Insert();
        object.display();
        object.sum();
        sc.close();
    }
}
