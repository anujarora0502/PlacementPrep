import java.util.*;

public class test {

    public static void main(String[] args) {

        MyGraph grph = new MyGraph(5);

        grph.addDirectionalEdge(0,1);
        grph.addDirectionalEdge(1,2);
        grph.addDirectionalEdge(2,3);
        grph.addDirectionalEdge(4,3);
        grph.addDirectionalEdge(4,1);

        System.out.println(grph);
    }
}