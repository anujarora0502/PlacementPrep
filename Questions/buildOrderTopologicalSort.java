//   THIS ONE IS WITH DFS AND STACK 

// import java.util.*;

// public class buildOrderTopologicalSort {
//     public static void main(String[] args) {

//         int V = 4;

//         ArrayList<Integer>[] graph = new ArrayList[V];

//         for (int i = 0; i < V; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[1].add(0);

//         graph[2].add(0);

//         graph[3].add(0);

//         boolean[] visited = new boolean[V];

//         ArrayList<Integer> topoOrder = new ArrayList<>();

//         for (int i = 0; i < V; i++) {
//             if (!visited[i])
//                 topoOrderDfs(i, topoOrder, graph, visited);
//         } 

//         Collections.reverse(topoOrder);

//         System.out.println(topoOrder);

//     }

//     public static void topoOrderDfs(int vertex, ArrayList<Integer> topoOrder, ArrayList<Integer>[] graph,
//             boolean[] visited) {

//         if (visited[vertex]) {
//             return;
//         }

//         visited[vertex] = true;

//         for (int i = 0; i < graph[vertex].size(); i++) {
//             topoOrderDfs(graph[vertex].get(i), topoOrder, graph, visited);
//         }

//         topoOrder.add(vertex);

//     }
// }


// KAHN's algorithm or bfs topological sort

import java.util.*;

public class buildOrderTopologicalSort {
    public static void main(String[] args) {

        int V = 6;

        ArrayList<Integer>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(3);

        graph[3].add(1);

        graph[4].add(0);
        graph[4].add(1);

        graph[5].add(0);
        graph[5].add(2);

        boolean[] visited = new boolean[V];

        ArrayList<Integer> topoOrder = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();

        int[] indegree = new int[V];

        for(int i = 0;i<V;i++){
           for(int j = 0;j<graph[i].size();j++){
               indegree[graph[i].get(j)]++;
           }
        }

        for(int i = 0;i<V;i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            Integer removedVertex = queue.remove();
            topoOrder.add(removedVertex);
            
            for(int i = 0;i<graph[removedVertex].size();i++){
                indegree[graph[removedVertex].get(i)]--;

                if(indegree[graph[removedVertex].get(i)] == 0){
                    queue.add(graph[removedVertex].get(i));
                }
            }
            
        }

        System.out.println(topoOrder);

    }
}
