import java.util.*;

public class quickSort {
    public static void main(String[] args) {
       int[] arr = {5,2,3,1};

       quickSortFn(arr, 0, arr.length - 1);

       print1DArr(arr);
    }

    public static void quickSortFn(int[] arr, int start, int end) {
        if(start<end){ 
        int partitioningIndex = partitioning(arr, start, end);

        quickSortFn(arr, start, partitioningIndex - 1);
        quickSortFn(arr, partitioningIndex + 1, end);
        }
    }

    public static int partitioning(int[] arr, int start, int end) {
        int pivot = end;

        int pointer = start;

        for(int i = start;i<=end;i++){
            if(arr[i]<arr[pivot]){
                swap(i,pointer,arr);
                pointer++;
            }
        }

        swap(pointer, pivot, arr);

        return pointer;
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