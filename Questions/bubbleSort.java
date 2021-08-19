import java.util.*;

public class bubbleSort{
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,8};
        
        bubbleSortFn(arr);

        print1DArr(arr);
        
    }

    public static void bubbleSortFn(int[] arr){

        int numberOfSwaps = 0;

        do{
            numberOfSwaps = 0;
            for(int i = 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    swap(i,i+1,arr);
                    numberOfSwaps++;
                }
            }

        }while(numberOfSwaps != 0);

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
}