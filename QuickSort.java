package ARRAY;

import java.util.Scanner;

public class QuickSort {
    Scanner sc=new Scanner(System.in);
    int arr[];
    int capacity;
    public QuickSort(int size){

        this.arr=new int[size];
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
    public int partition(int arr[],int low,int high) {
        int povit = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= povit) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+10];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public void sort(int arr[],int low,int high){
        if (low<high){
            int s=partition(arr,low,high);
            sort(arr,low,s-1);
            sort(arr,s+1,high);
        }

    }

    public static void main(String[] args) {
        QuickSort ob=new QuickSort(10);
        ob.insert();
        ob.sort(ob.arr,0,9);
        ob.display();
    }
}
