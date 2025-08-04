import java.util.*;

class Graph{
    Map<Integer,Set<Integer>> adj = new HashMap<>();

    void addEdges(int u,int v){
        if(!adj.containsKey(u))
            adj.put(u,new HashSet<>());
        if(!adj.containsKey(v))
            adj.put(v,new HashSet<>()); // If undirected
        adj.get(u).add(v);
        adj.get(v).add(u); // If undirected
    }

    void addEdges(int u){
        if(!adj.containsKey(u))
            adj.put(u,new HashSet<>());
    }

    int countVertices(){
        return adj.size();
    }

    int countEdges(){
        int count = 0;
        for(Set<Integer> i:adj.values())
            count += i.size();
        return count/2;
    }

    void printNeighbours(){
        for(int i:adj.keySet()){
            System.out.print(i+" : ");
            if(adj.get(i).size()==0)
                System.out.print("No edges");
            else{
                for(int j:adj.get(i))
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    boolean pathExist(int src, int dest){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];
        q.add(src);
        visited[src] = true;
        while(!q.isEmpty()){
            int vertex = q.poll();
            if(vertex==dest) return true;
            for(int i:adj.get(vertex)){
                if(!visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        return false;
    }

    void removeEdge(int u, int v){
        adj.get(u).remove(v);
        adj.get(v).remove(u);
    }

    void removeVertex(int u){
        adj.remove(u);
        for(int i=0;i<adj.size();i++){
            if(adj.containsKey(i) && adj.get(i).contains(u))
                adj.get(i).remove(u);
                
            // if(adj.get(i).size()==0)
            //     adj.remove(i);
        }
    }

}

public class Main{
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdges(0,1);
        g.addEdges(1, 0); // Don't allow duplicates as we used Set instead of ArrayList
        g.addEdges(2, 0);
        g.addEdges(1, 3);
        g.addEdges(3, 2);
        System.out.println("No. of. Vertices: "+g.countVertices());
        System.out.println("No. of. Edges: "+g.countEdges());
        System.out.println(g.pathExist(2,1));
        g.printNeighbours();
        g.removeEdge(0, 1);
        g.removeVertex(2);
        g.printNeighbours();
    }
}