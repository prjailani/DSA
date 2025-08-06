import java.util.*;

class Broadcast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Set<Character>> adj = new HashMap<>();
        
        System.out.println("Enter no of computers: ");
        int v = sc.nextInt();
        for(int i=0;i<v;i++){
            System.out.print("Enter computer "+(i+1)+" name: ");
            char c = sc.next().charAt(0);
            adj.put(c,new HashSet<>());
        }

        System.out.print("Enter no of connections: ");
        int e = sc.nextInt();

        for(int i=0;i<e;i++){
            System.out.print("Source: ");
            char src = sc.next().charAt(0);
            System.out.print("Destination: ");
            char dest = sc.next().charAt(0);
            adj.get(src).add(dest);
            adj.get(dest).add(src);
            System.out.println();
        }

        System.out.println("Enter the root computer");
        char root = sc.next().charAt(0);

        Queue<Character> q = new LinkedList<>();
        Set<Character> vis = new HashSet<>();
        vis.add(root);
        q.add(root);

        System.out.print("Broadcast Order: ");
        while(!q.isEmpty()){
            char curr = q.poll();
            System.out.print(curr+" ");
            
            for(char i:adj.get(curr)){
                if(!vis.contains(i)){
                    q.offer(i);
                    vis.add(i);
                }
            }
        }
    }    
}