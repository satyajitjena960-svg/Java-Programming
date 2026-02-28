package ARRAY;

import java.util.Scanner;

public class PairSum {
    Scanner sc=new Scanner(System.in);
    int arr[];
    int capacity;
    public PairSum(int size){

        this.arr=new int[size];
    }
    public void sum(int value){
        for (int i=0;i< arr.length;i++){

            for (int j=i+1;j< arr.length;j++){
                if (arr[i]+arr[j]==value){
                    System.out.println(arr[i]+"      "+arr[j]);
                }
            }
        }
    }
    public void insert(){
        System.out.println("enter the elements");
        for(int i = 0; i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        PairSum ob = new PairSum(5);
        ob.insert();
        ob.sum(10);

    }
}
