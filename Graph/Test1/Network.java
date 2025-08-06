import java.util.*;

class Pair{
    char computer;
    int weight;

    Pair(char computer, int weight){
        this.computer = computer;
        this.weight = weight;
    }
}

class Node{
    char src;
    char par;
    int w;

    Node(char src,char par,int w){
        this.src = src;
        this.par = par;
        this.w = w;
    }
}

class Network{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character,List<Pair>> adj = new HashMap<>();
        
        System.out.print("No. of. computers: ");
        int n = sc.nextInt();

        System.out.println("Enter computer names");

        for(int i=0;i<n;i++){
            char c = sc.next().charAt(0);
            adj.put(c,new ArrayList<>());
        }

        System.out.println("Enter no of connections");
        int connections = sc.nextInt();

        for(int i=0;i<connections;i++){
            System.out.print("Enter source: ");
            char src = sc.next().charAt(0);
            System.out.print("Enter dest: ");
            char dest = sc.next().charAt(0);
            System.out.print("Enter weight: ");
            int w = sc.nextInt();

            adj.get(src).add(new Pair(dest, w));
            System.out.println();
        }

        Set<Character> vis = new HashSet<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a->a.w));

        System.out.print("Enter starting point: ");
        char c = sc.next().charAt(0);
        pq.add(new Node(c,'-',0));

        int sum = 0;

        while(!pq.isEmpty()){
            Node temp = pq.poll();
            if(!vis.contains(temp.src)){
                vis.add(temp.src);
                if(temp.par!='-'){
                    System.out.println(temp.par+"-"+temp.src+"("+temp.w+")");
                }
                sum += temp.w;
                for(Pair i:adj.get(temp.src)){
                    pq.add(new Node(i.computer,temp.src,i.weight));
                }
            }
        }
        System.out.println("Total Cost: "+sum);
    }
}