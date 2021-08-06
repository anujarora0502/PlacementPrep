import java.util.*;

public class RobotInAGrid{
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[1][0] = -1;
        arr[2][0] = -1;
        arr[3][0] = -1;
        arr[4][0] = -1;
        arr[1][1] = -1;
        arr[2][1] = -1;
        arr[3][1] = -1;
        arr[4][1] = -1;

        ArrayList<Point> path = new ArrayList<>();

        System.out.println(pathFinder(0,0,arr,path));

        System.out.println(path);
    }

    public static class Point{
        int r;
        int c;

        Point(int r, int c){
            this.r = r;
            this.c = c;
        }

        @Override
        public String toString() {
            return "("+r+","+c+")";
        }
    }

    public static boolean pathFinder(int r, int c, int[][] arr,ArrayList<Point> path){
        if(r == arr.length-1 && c == arr.length - 1){
            Point p = new Point(r,c);
            path.add(p);
            return true;
        }

        if(r>=arr.length||c>=arr[0].length||arr[r][c] == -1){
            return false;
        }

        Point p = new Point(r,c);

        path.add(p);

        boolean rightResult = false,downResult = false;

        downResult = pathFinder(r+1,c,arr,path);
        if(downResult == false)
        rightResult = pathFinder(r,c+1,arr,path);


        if((rightResult||downResult) == false){
            path.remove(p);
        }

        return rightResult||downResult;
    }
}