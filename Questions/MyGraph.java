import java.util.*;

public class MyGraph{

   ArrayList<ArrayList<Edge>> graph;

   MyGraph(int numberOfVertices){
       graph = new ArrayList<>();

       for(int i = 0;i<numberOfVertices;i++){
           graph.add(new ArrayList<Edge>());
       }
   }

   public void addDirectionalEdge(int u, int v){
        Edge e = new Edge(v);

        graph.get(u).add(e);
   }

   public void addEdge(int u, int v){
    graph.get(u).add(new Edge(v));
    graph.get(v).add(new Edge(u));
}

   public class Edge{
       int v,w;

       Edge(int v){
           this.v = v;
           this.w = 0;
       }

       Edge(int v, int w){
           this.v = v;
           this.w = w;
       }

       @Override
       public String toString() {
         return v+"";    
       }
   }

   @Override
   public String toString() {
       return graph+"";
   }

}