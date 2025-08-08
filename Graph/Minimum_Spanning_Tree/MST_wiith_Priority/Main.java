import java.util.*;

public class Main{
    // static class Pair{
    //     int v,p,w;
    //     Pair(int v,int p,int w){
    //         this.v = v;
    //         this.p = p;
    //         this.w = w;
    //     }
    // }

    record Pair(int v,int p,int w, int pri){}

    public static void main(String[] args) {
        int V = 5;

        List<List<int[]>> g = new ArrayList<>();

        for(int i=0;i<=V;i++){
            g.add(new ArrayList<>());
        }
        

        /* 
            4 5
            1 2 1 1
            2 3 2 0
            3 4 1 1
            4 1 2 0
            1 3 3 1
        */
        // See the diagram in note

        g.get(1).add(new int[] {2,1,1});
        g.get(2).add(new int[] {1,1,1});
        
        g.get(2).add(new int[] {3,2,0});
        g.get(3).add(new int[] {2,2,0});

        g.get(3).add(new int[] {4,1,1});
        g.get(4).add(new int[] {3,1,1});

        g.get(4).add(new int[] {1,2,0});
        g.get(1).add(new int[] {4,2,0});

        g.get(1).add(new int[] {3,3,1});
        g.get(3).add(new int[] {1,3,0});

        prim(g,V);
    }

    static void prim(List<List<int[]>> g,int V){
        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.w==b.w?a.pri-b.pri:a.w-b.w);

        pq.offer(new Pair(1, -1, 0,0)); // current node, parent, weight

        int sum = 0;

        System.out.println("Edges of Minimum Spanning Tree:");
        
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            if(!visited[curr.v]){
                visited[curr.v] = true;
                if(curr.p!=-1){
                    System.out.println(curr.p +" -> "+curr.v+" : (weight:"+curr.w+")"+" Priority = "+curr.pri);
                    sum += curr.w;
                }
                for(int[] i:g.get(curr.v)){
                    if(!visited[i[0]])
                        pq.add(new Pair(i[0],curr.v,i[1],i[2]));
                }
            }
        }

        System.out.println("Total weight = "+sum);
    }


}