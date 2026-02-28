package ARRAY;
import java.util.Scanner;
public class ArrayOperations {
    Scanner sc=new Scanner(System.in);
    int[] arr;
    int size=0;
    int capacity;

    public void declar(){
        System.out.println("enter the array size");
        capacity= sc.nextInt();
        arr=new int[capacity];
        System.out.println("enter the no of element");
        size= sc.nextInt();
        System.out.println("enter the elements");
        for(int i = 0; i<size;i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void display(){
        System.out.println("the elements of arrays are");
        for (int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }

    public void insertAnyposition(int element,int position){
        if (size >= capacity) {
            System.out.println("Array full!");
            return;
        }
        if (position < 0 || position > size) {
            System.out.println("Invalid position: " + position);
            return;
        }
        for (int i = size - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = element;
        size++;
    }

    public void insertBegining(int element){
        if (size >= capacity) {
            System.out.println("Array full!");
            return;
        }
        for(int i =size-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=element;
        size++;
    }

    public void deleteAnyposition(int position){
        if (position < 0 || position >= size) {
            System.out.println("Invalid position: " + position);
            return;
        }
        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void deletbegning(){
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        for(int i =0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }

    public static void main(String[] args) {
        ArrayOperations ob=new ArrayOperations();
        ob.declar();
        ob.display();

        ob.insertAnyposition(40,2);
        ob.display();

        ob.insertBegining(15);
        ob.display();

        ob.deleteAnyposition(2);
        ob.display();

        ob.deletbegning();
        ob.display();
    }
}
