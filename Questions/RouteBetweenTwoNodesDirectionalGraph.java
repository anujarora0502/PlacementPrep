import java.util.*;

public class RouteBetweenTwoNodesDirectionalGraph {
    public static void main(String[] args) {
        MyGraph grph = new MyGraph(5);
        
        grph.addDirectionalEdge(0, 1);
        grph.addDirectionalEdge(1, 2);
        grph.addDirectionalEdge(2, 3);
        grph.addDirectionalEdge(4, 3);
        grph.addDirectionalEdge(4, 1);

        System.out.println(isThereARoute(0,3,grph));
        System.out.println(isThereARoute(0,4,grph));

    }

    public static boolean isThereARoute(int u, int v, MyGraph grph) {
         // this is dfs 
        if (u == v) {
            return true;
        }
        for (int i = 0; i < grph.graph.get(u).size(); i++) {
            boolean result = isThereARoute(grph.graph.get(u).get(i).v, v, grph);
            if (result == true)
                return true;
        }

        return false;
    }
}