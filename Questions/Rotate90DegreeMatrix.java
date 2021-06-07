import java.util.*;

public class Rotate90DegreeMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = Integer.parseInt(scn.next());

        String[][] sarr = new String[n][n];

        for (int i = 0; i < n; i++) {
            for(int j = 0;j<n;j++)
            sarr[i][j] = scn.next();
        }

        int topRow = 0;
        int bottomRow = sarr.length - 1;
        int leftColumn = 0;
        int rightColumn = sarr.length - 1;

        while (topRow < sarr.length / 2) {

            // first of all all the corners
            swap(sarr, topRow, leftColumn, topRow, rightColumn);
            swap(sarr, bottomRow, leftColumn, bottomRow, rightColumn);
            swap(sarr, topRow, leftColumn, bottomRow, rightColumn);

            // swaping the upper right half diagonally

            for (int i = leftColumn + 1; i <= rightColumn - 1; i++) {
                swap(sarr, topRow, i, topRow + i - leftColumn, rightColumn);
            }

            // swaping the bottom left half diagonally

            for (int i = leftColumn + 1; i <= rightColumn - 1; i++) {
                swap(sarr, bottomRow, i, topRow + i - leftColumn, leftColumn);
            }

            // swapping top arr and bottom arr

            for (int i = leftColumn + 1; i <= rightColumn - 1; i++) {
                swap(sarr, topRow, i, bottomRow, rightColumn + leftColumn - i);
            }

            topRow++;
            bottomRow--;
            leftColumn++;
            rightColumn--;

        }

        printMatrix(sarr);

        scn.close();

    }

    public static void printMatrix(String[][] sarr) {
        for (String[] c : sarr) {
            for (String ch : c) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

    }

    public static void swap(String[][] sarr, int a, int b, int c, int d) {
        String temp = sarr[a][b];
        sarr[a][b] = sarr[c][d];
        sarr[c][d] = temp;
        // printMatrix(sarr);
        // System.out.println();
    }
}