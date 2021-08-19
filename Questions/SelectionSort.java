import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 9, 8, 7, 1, 2 };

        SelectionSortFn(arr);

        print1DArr(arr);

    }

    public static void print1DArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SelectionSortFn(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            swap(min,i,arr);

        }

    }

    public static void swap(int a, int b, int[] arr) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

}