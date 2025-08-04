package ArrayList_Implementation;
import java.util.*;

import Queue;
import Stack;

class Graph{
    ArrayList<ArrayList<Integer>> graph;
    Graph(int v){
        graph = new ArrayList<>();
        for(int i=0;i<v;i++)
            graph.add(new ArrayList<Integer>());
    }

    void insert(int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u); // If undirected
    }

    void display(){
        for(int i=0;i<graph.size();i++){
            System.out.print(i+" -> ");
            for(int j:graph.get(i)){
                System.out.print(j+",");
            }
            System.out.print("Null\n");
        }
    }

    void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        q.add(v);
        visited[v] = true;
        while(!q.isEmpty()){
            int vertex = q.poll();
            System.out.println(vertex);
            for(int i:graph.get(vertex)){
                if(!visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    void dfs(int v){
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[graph.size()];
        st.push(v);
        visited[v] = true;
        while(!st.isEmpty()){
            int vertex = st.pop();
            System.out.println(vertex);
            for(int i:graph.get(vertex)){
                if(!visited[i]){
                    st.push(i);
                    visited[i] = true;
                }
            }
        }
    }

    boolean pathExist(int src, int dest){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        q.add(src);
        visited[src] = true;
        while(!q.isEmpty()){
            int vertex = q.poll();
            if(vertex==dest) return true;
            for(int i:graph.get(vertex)){
                if(!visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        return false;
    }

    void checkPath(int src,int dest){
        if(pathExist(src, dest))
            System.out.println("Path Exist");
        else
            System.out.println("No Path Exist");
    }
}

public class Main{
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.insert(0, 1);
        g.insert(0, 3);
        g.insert(1, 2);
        g.insert(1, 3);
        g.insert(2, 4);
        g.insert(3, 4);
        g.checkPath(0, 4);
        
    }
}