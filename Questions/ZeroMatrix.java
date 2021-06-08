import java.util.*;

public class ZeroMatrix {
    // public static void main(String[] args) {

    // Scanner scn = new Scanner(System.in);

    // int m = scn.nextInt();
    // int n = scn.nextInt();

    // int[][] matrix = new int[m][n];

    // for (int i = 0; i < m; i++) {
    // for (int j = 0; j < n; j++) {
    // matrix[i][j] = scn.nextInt();
    // }
    // }

    // ArrayList<coordinates> al = new ArrayList<>();

    // for (int i = 0; i < m; i++) {
    // for (int j = 0; j < n; j++) {
    // if(matrix[i][j] == 0){
    // al.add(new coordinates(i, j));
    // }
    // }
    // }

    // for(coordinates c:al){
    // int row = c.row;
    // int col = c.col;

    // for(int i = 0;i<n;i++){
    // matrix[row][i] = 0;
    // }

    // for(int i = 0;i<m;i++){
    // matrix[i][col] = 0;
    // }

    // }

    // printMatrix(matrix);

    // }

    // public static class coordinates{

    // int row;
    // int col;

    // coordinates(int row,int col){
    // this.row = row;
    // this.col = col;
    // }

    // @Override
    // public String toString() {

    // return "("+row+","+col+")";
    // }

    // }

    public static void printMatrix(int[][] arr) {
        for (int[] n : arr) {
            for (int m : n) {
                System.out.print(m + " ");
            }

            System.out.println();
        }

    }

    // we will se a better approach below we will use the space of matrix itself

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        boolean firstRowHasZero = false,firstColumnHasZero = false;

        for(int i = 0;i<n;i++){
            if(matrix[0][i] == 0){
                firstRowHasZero = true;
            }
        }
        
        for(int i = 0;i<m;i++){
            if(matrix[i][0] == 0){
                firstColumnHasZero = true;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
               if(matrix[i][j] == 0){
                   matrix[i][0] = 0;
                   matrix[0][j] = 0;
               }
            }
        }

        for(int i = 0;i<n;i++){
            if(matrix[0][i] == 0){
                nullifyCol(matrix,i);
            }
        }

        for(int i = 0;i<m;i++){
            if(matrix[i][0] == 0){
                nullifyRow(matrix,i);
            }
        }

        if(firstColumnHasZero){
            nullifyCol(matrix,0);
        }

        if(firstRowHasZero){
            nullifyRow(matrix,0);
        }

        printMatrix(matrix);
        

    }

    public static void nullifyRow(int[][] matrix,int row){
          for(int i = 0;i<matrix[0].length;i++){
              matrix[row][i] = 0;
          }
    }

    public static void nullifyCol(int[][] matrix,int col){
        for(int i = 0;i<matrix.length;i++){
            matrix[i][col] = 0;
        }
  }
}