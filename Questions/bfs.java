import java.util.*;

public class bfs {

    public static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    public static void main(String[] args) {

        int n = 8;

        ArrayList<Edge>[] graph = new ArrayList[n];

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));
        graph[1].add(new Edge(1, 5));

        graph[2].add(new Edge(2, 6));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 1));

        graph[6].add(new Edge(6, 2));
        graph[6].add(new Edge(6, 7));

        graph[7].add(new Edge(7, 6));

        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);

        boolean[] visited = new boolean[n];
        visited[0] = true;

        while (!queue.isEmpty()) {
            Integer removedNode = queue.remove();

            result.add(removedNode);

            for (int i = 0; i < graph[removedNode].size(); i++) {
                if (!visited[graph[removedNode].get(i).nbr]) {
                    visited[graph[removedNode].get(i).nbr] = true;
                    queue.add(graph[removedNode].get(i).nbr);
                }
            }
        }

        System.out.println(result);
    }
}