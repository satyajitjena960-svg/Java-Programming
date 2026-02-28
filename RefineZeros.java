package ARRAY;

import java.util.Scanner;

public class RefineZeros {
    Scanner sc=new Scanner(System.in);
    int[] arr;
    int NoOfElement= sc.nextInt();
    public RefineZeros(int size) {

        this.arr=new int [size];
    }

    public void refine(){

        int result=0;
//        for (int i=0;i< NoOfElement;i++){
//            if (arr[i]==0) {
//                result = i;
//                deleteAnyposition(result);
//                arr[NoOfElement]=0;
//                NoOfElement++;
//            }
//
//        }
        for (int i=0;i<NoOfElement;i++){
            if (arr[i]!=0){
                arr[result]=arr[i];
                result++;
            }
        }
        while (result<NoOfElement){
            arr[result]=0;
            result++;
        }
    }


    public void deleteAnyposition(int position){
        if (position < 0 || position >= NoOfElement) {
            System.out.println("Invalid position: " + position);
            return;
        }
        for (int i = position; i < NoOfElement ; i++) {
            arr[i] = arr[i + 1];
        }
        NoOfElement--;
    }
    public void insert(){
        System.out.println("enter the elements");
        for(int i = 0; i<NoOfElement;i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void Display(){
        System.out.println("enter the elements");
        for(int i = 0; i<NoOfElement;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        RefineZeros ob1=new RefineZeros(50);
//        ArrayOperations ob=new ArrayOperations();
        ob1.insert();
        ob1.refine();
        ob1.Display();


    }
}
