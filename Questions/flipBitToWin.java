import java.util.*;

public class flipBitToWin{
  public static void main(String[] args) {
      int[] arr = {1,1,0,1,1,1,1,0,1,1,1};

      int maxLength = 0;

      for(int i = 0;i<arr.length;i++){
          if(arr[i] == 0){
              arr[i] = 1;
              int result = LongestSequence(arr);
              if(result > maxLength)
                maxLength = result;
              arr[i] = 0;
          }
      }

      int originalArrResult = LongestSequence(arr);

      if(originalArrResult > maxLength){
          maxLength = originalArrResult;
      }
        

      System.out.println(maxLength);

  }

  public static int LongestSequence(int[] arr){
      int max = 0;
      
      int runningLength = 0;

      for(int i = 0;i<arr.length;i++){
          if(arr[i] == 1){
              runningLength++;
          }else{
              if(runningLength > max){
                  max = runningLength;
              }

              runningLength = 0;
          }
      } 
      if(runningLength > max){
          max = runningLength;
      }
      return max;
  }
}