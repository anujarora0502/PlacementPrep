import java.util.*;

public class InsertionSort{
    public static void main(String[] args) {
        
       int[] arr = {6,10,1,4,5,9};

       InsertionSortFn(arr);
       
       print1DArr(arr);
    }

    public static void print1DArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int a, int b, int[] arr) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }


    public static void InsertionSortFn(int[] arr){
        
       int n = arr.length;

       for(int i = 1;i<n;i++){
           
           int j = i-1;
           int val = arr[i];

           while(j>=0&&arr[j]>val){
              arr[j+1] = arr[j];
              j--;
           }

           arr[j+1] = val;
       }

    }

}