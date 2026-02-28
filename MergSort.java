package ARRAY;

import java.util.Scanner;

public class MergSort {
    Scanner sc=new Scanner(System.in);
    int[]arr;
    public MergSort(int size){

        this.arr=new int[size];
    }
    public void merge(int[]arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[]l=new int[n1];
        int[]r=new int[n2];
        for (int i=0;i<n1;i++){
            l[i]=arr[low+i];
        }
        for (int i=0;i<n2;i++){
            r[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=low;
        while (i<n1 && j<n2){
            if (l[i]<=r[j])
                arr[k++]=l[i++];
            else
                arr[k++]=r[j++];
        }
        while (i<n1){
            arr[k++]=l[i++];
        }

    }
    public void sort(int[]arr,int low,int high){
        if (low<high){
            int mid=low+(high-low)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
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
        MergSort ob=new MergSort(5);
        ob.insert();
        ob.sort(ob.arr,0,ob.arr.length-1);
        ob.display();
    }
}
