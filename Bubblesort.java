package ARRAY;

import java.util.Scanner;

public class Bubblesort {
    Scanner sc=new Scanner(System.in);
    int arr[];
    int capacity;
    public Bubblesort(int size){

        this.arr=new int[size];
    }
    public void bubblesort(){
        int a=arr.length;
        for (int i=0;i<a;i++){
            for (int j=0;j<a-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void selectionSort(){
        int a=arr.length;
        for(int i=0;i<a-1;i++){
            int min=i;
            for (int j=i+1;j<a;j++){
                if (arr[j]<arr[min])
                    min=j;
            }
            if (min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }

    public void insert(){
        System.out.println("enter the elements");
        for(int i = 0; i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void display(){
        System.out.println("the elements of arrays are");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Bubblesort ob = new Bubblesort(5);
        ob.insert();
        ob.bubblesort();
        ob.selectionSort();
        ob.display();
    }

}
