package ARRAY;

import java.util.Scanner;

public class FindMostCommon {
    Scanner sc=new Scanner(System.in);
    int arr[];
    int capacity;
    public FindMostCommon(int size){

        this.arr=new int[size];
    }
    public void Find(){
            int max=arr[0];
            for (int i=0;i< arr.length;i++){
                if (arr[i]>max){
                    max=arr[i];
                }
            }
           int[]frequency=new int[max+1];
        for (int i=0;i< arr.length;i++){
            int val=arr[i];
            frequency[val]++;
        }
        int mostfrequent=0;
        int highestcount=0;
        for (int i=0;i< frequency.length;i++){
            if (frequency[i]>highestcount){
                highestcount=frequency[i];
                mostfrequent=i;
            }
        }
        System.out.println(mostfrequent);

    }
    public void insert(){
        System.out.println("enter the elements");
        for(int i = 0; i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        FindMostCommon ob = new FindMostCommon(10);
        ob.insert();
        ob.Find();
    }
}

