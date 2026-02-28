package ARRAY;

import java.util.Scanner;

public class InsertionSort {
    Scanner sc=new Scanner(System.in);
    int arr[];
    int capacity;
    public InsertionSort(int size){

        this.arr=new int[size];
    }
    public void sort(){
        int t=0;
        for (int i=1;i< arr.length;i++){
            t=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>t){
                if(arr[j+1]!=arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            }
            arr[j+1]=t;

        }
        System.out.println("sorting complete");
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
        InsertionSort ob= new InsertionSort(5);
        ob.insert();
        ob.sort();
        ob.display();
    }
}
