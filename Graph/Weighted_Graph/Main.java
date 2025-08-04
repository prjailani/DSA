import java.util.*;

class Node{
    int u;
    List<Integer> vList;
    List<Integer> wList;
    
    Node(int u){
        this.u = u;
        this.vList = new ArrayList<>();
        this.wList = new ArrayList<>();
    }
}

class Graph{
    List<Node> g;
    void create(int v){
        g = new ArrayList<>(v);
        for(int i=0;i<v;i++){
            g.add(new Node(i));
        }
    }
    
    void addEdge(int u,int v,int w){
        g.get(u).vList.add(v);
        g.get(u).wList.add(w);
        g.get(v).vList.add(u);
        g.get(v).wList.add(w);
    }
    
    void printAdj(){
        for(int i=0;i<g.size();i++){
            for(int j=0;j<g.get(i).vList.size();j++){
                System.out.println(i+" -> "+g.get(i).vList.get(j)+" : "+g.get(i).wList.get(j));
            }
        }
    }
}

public class Main{
    public static void main(String[] args){
        Graph graph = new Graph();
        graph.create(6);
        graph.addEdge(0,1,4);
        graph.addEdge(0,2,6);
        graph.addEdge(1,2,2);
        graph.addEdge(1,3,3);
        graph.addEdge(2,4,4);
        graph.addEdge(3,5,8);
        graph.addEdge(4,5,5);
        graph.printAdj();
    }
}