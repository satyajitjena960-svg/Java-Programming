package ARRAY;

import java.util.Scanner;

public class Select {
    public void selectionSort(int arr[],int size){
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

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
         int size= sc.nextInt();
        int[] arr;
        arr=new int[size];
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Select ob=new Select();
        ob.selectionSort(arr,size);

        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
