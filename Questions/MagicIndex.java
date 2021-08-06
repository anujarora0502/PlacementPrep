import java.util.*;

public class MagicIndex{
    public static void main(String[] args) {
        int[] arr = {-10, -5, 3, 4, 7, 9};


        System.out.println(binarySearch(0,arr.length-1,arr));
    }

    public static int binarySearch(int start, int end, int[] arr){
        if(start>=end){
            return -1;
        }

        int mid = (start+end)/2;

        if(arr[mid] == mid){
            return mid;
        }

        int leftResult = binarySearch(start,Math.min(arr[mid],mid-1), arr);
        int rightResult = binarySearch(Math.max(arr[mid],mid+1),end, arr);

        

        
        if(leftResult == -1&&rightResult == -1){
            return -1;
        }

        if(leftResult == -1){
            return rightResult;
        }else{
            return leftResult;
        }
    }
}