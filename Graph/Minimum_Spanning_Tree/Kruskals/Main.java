import java.util.*;

class Edge{
    int src,dest,w;
    Edge(int src, int dest, int w){
        this.src = src;
        this.dest = dest;
        this.w = w;
    }
}
class DisjointSet{
    int[] parent;

    DisjointSet(int n){
        parent = new int[n];
        for(int i=0;i<n;i++)
            parent[i] = i;
    }

    int find(int x){
        if(parent[x]!=x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    boolean union(int a,int b){
        int rootA = find(a);
        int rootB = find(b);
        if(rootA==rootB)
            return false;
        parent[rootA] = rootB;
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        int v = 5;

        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0,1,2));
        edges.add(new Edge(0,3,6));
        edges.add(new Edge(3,1,8));
        edges.add(new Edge(1,4,5));
        edges.add(new Edge(4,2,7));
        edges.add(new Edge(1,2,3));

        DisjointSet ds = new DisjointSet(v);

        edges.sort(Comparator.comparingInt(a->a.w));

        int sum = 0;

        System.out.println("Minimum Spanning Tree");

        for(Edge ed: edges){
            if(ds.union(ed.src,ed.dest)){
                sum += ed.w;
                System.out.println(ed.src+" -> "+ed.dest+" : "+ed.w);
            }
        }

        System.out.println("Total cost = "+sum);
    }
}
