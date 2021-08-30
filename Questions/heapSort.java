import java.util.*;

//max heap is used here

public class heapSort{
    public static void main(String[] args) {
        
      int[] arr = {-8,-10,-1,2};

      int[] heap = buildHeap(arr);

      heapSortFn(heap);

      print1DArr(heap);

    }

    public static void heapSortFn(int[] arr){
        for(int i = arr.length-1;i>=0;i--){
            swap(0,i,arr);
            downHeapify(arr,i-1);
        }
    }

    public static void downHeapify(int[] arr, int end){
        
      int index = 0;
      
      while(index<=end){
          int max = index;
          
          int leftChild = (2*index)+1;
          int rightChild = (2*index)+2;
          
          if(leftChild>end){
             return;
          }

          if(rightChild>end){
            if(arr[leftChild]>arr[max]){
            swap(leftChild,index,arr);
            index = rightChild;
            continue;
            }else{
                return;
            }    
        }


          if(arr[leftChild]<arr[rightChild]){
              if(arr[max]<arr[rightChild]){
                  max = rightChild;
              }
          }else{
              if(arr[max]<arr[leftChild]){
                  max = leftChild;
              }
          }

          if(max == index){
              return;
          }

          swap(max,index,arr);

          index = max;


      }

    }

    public static int[] buildHeap(int[] arr){
        int[] heap = new int[arr.length];
        
        for(int i = 0;i<arr.length;i++){
            heap[i] = arr[i];
            upHeapify(heap, i);
        }

        return heap;

    }

    public static void upHeapify(int[] arr, int index){
         
        while(index>0){
            if(arr[((index-1)/2)] < arr[index]){
                swap(((index-1)/2),index,arr);
                index = ((index-1)/2);
            }else{
                break;
            }
        }

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