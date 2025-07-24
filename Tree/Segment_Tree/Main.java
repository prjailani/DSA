class Node{
    int st,end,sum;
    Node left, right;
    Node (int st,int end){
        this.st = st;
        this.end = end;
    }
}

class SegmentTree{
    Node root;
    void insert(int st,int end){
        root = new Node(st,end);
        insertHelper(root, st, end);
        sumHelper(root);
    }

    void insertHelper(Node root, int st, int end){
        if(st==end)
            return;
        int mid = st+(end-st)/2;
        root.left = new Node(st,mid);
        root.right = new Node(mid+1,end);

        insertHelper(root.left, st, mid);
        insertHelper(root.right, mid+1, end);
    }

    int sumHelper(Node root){
        if(root.left==null && root.right==null)
            return root.sum = root.st;
        return root.sum = sumHelper(root.left)+sumHelper(root.right);
    }

    void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.st+" "+root.end+" :"+root.sum);
    }

    int query(int st, int end){
        int total = root.sum;
        if(st>root.st){
            int val = queryHelper(1, st-1, root);
            if(val==-1){
                val = query(1, st-1);
            }
            total -= val;
        }
        if(end<root.end){
            int val = queryHelper(end+1, root.end, root);
            if(val==-1)
                val = query(end+1,root.end);
            total -= val;
        }
       return total;
    }

    int queryHelper(int st,int end,Node root){
        if(st==0)
        if(st>end) return 0;
        if(root.st==st && root.end==end){
            return root.sum;
        }
        int mid  = root.st + (root.end-root.st)/2;
        if(root.st==mid && mid==root.end) return -1;
        System.out.println(root.st+" "+root.end+" "+mid);
        if(st<=mid)
            return queryHelper(st, end, root.left);
        return queryHelper(st, end, root.right);
    }
}

class Main{
    public static void main(String[] args) {
        SegmentTree tree = new SegmentTree();
        tree.insert(1,5);
        System.out.println(tree.query(1, 5));

    }
}