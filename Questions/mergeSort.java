import java.util.*;

public class mergeSort{
    public static void main(String[] args) {
        
       int[] arr = {10,9,8,7,6,5,4,3,2};
       
       print1DArr(mergeSortFn(arr, 0,arr.length-1));
       

    }

    public static void print1DArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int[] mergeSortFn(int[] arr,int start, int end){

        if(start == end){
            int[] temp = new int[1];
            temp[0] = arr[start];

            return temp;
        }
        
        int mid = (start+end)/2;

        int[] leftResult = mergeSortFn(arr, start, mid);
        int[] rightResult = mergeSortFn(arr, mid+1, end);

        return merge(leftResult,rightResult);
        

    }

    public static int[] merge(int[] arr1, int[] arr2){
        
        int p1 = 0;
        int p2 = 0;

        int[] mergedArr = new int[arr1.length+arr2.length];

        int index = 0;

        while(p1<arr1.length&&p2<arr2.length){
            
            if(arr1[p1]<arr2[p2]){
                mergedArr[index] = arr1[p1];
                p1++;
            }else{
                mergedArr[index] = arr2[p2];
                p2++;
            }

            index++;
        }

        while(p1<arr1.length){
            mergedArr[index] = arr1[p1];
            p1++;
            index++; 
        }

        while(p2<arr2.length){
            mergedArr[index] = arr2[p2];
            p2++;
            index++; 
        }


        return mergedArr;

    }
}