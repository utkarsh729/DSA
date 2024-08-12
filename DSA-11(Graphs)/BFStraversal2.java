import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class BFStraversal2 {


    //  SOLVED ON GFG
    // TIME COMPLEXITY IS O(N)+O(2E)...O(N) for visiting every node and O(2E) for total degree
    LinkedList<Integer> adj[];
    // int V=4;

    @SuppressWarnings("unchecked")
    public BFStraversal2(int v){
        adj=new LinkedList[v];

        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }

    public void addEdge(int v, int u){
        adj[v].add(u);
    }

    public void printAdj(){
        for(int i=0;i<adj.length;i++){
            System.out.print("Adjacency list of vertex: "+i+ " ");
            for(int j=0;j<adj[i].size();j++){
                System.out.print(adj[i].get(j)+" ");
            }
            System.out.println();
        }
    }

    public void traversal(int s){

        boolean []visited=new boolean[4];
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.add(s);


        while(!q.isEmpty()){
            s=q.poll();
            System.out.print(s+" ");

            Iterator<Integer> itr=adj[s].iterator();

            while(itr.hasNext()){
                int n=itr.next();
                if(!visited[n]){
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
    }

    
    public static void main(String[] args) {
        int v=4;
        

        BFStraversal2 obj=new BFStraversal2(v);
        obj.addEdge(0,1);
        obj.addEdge(0,2);
        obj.addEdge(1,2);
        obj.addEdge(2,0);
        obj.addEdge(3,3);
        obj.addEdge(2,3);

        obj.printAdj();

        System.out.println("BFS traversal form 1: ");
        obj.traversal(1);

        System.out.println("\nBFS traversal form 2: ");
        obj.traversal(2);
        
        System.out.println("\nBFS traversal form 3: ");
        obj.traversal(3);
        
        System.out.println("\nBFS traversal form 0: ");
        obj.traversal(0);
    }
}
