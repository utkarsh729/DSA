import java.util.LinkedList;
import java.util.Iterator;


public class DFStraversal {

    // solved on gfg
    // time complexity is O(n)+O(2E)=O(N+E)

    LinkedList<Integer> adj[];
    
    @SuppressWarnings("unchecked")
    public DFStraversal(int v){

        adj=new LinkedList[v];  
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }

    }

    public void addEdges(int v, int u){
        adj[v].add(u);

    }
    public void printAdj() {
        for (int i = 0; i < adj.length; i++) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j) + " ");
            }
            System.out.println();
        }
    }
    
  
    public void traversal(int v, boolean [] visited){
        visited[v]=true;    
        System.out.print(v+" ");

        Iterator<Integer> itr=adj[v].iterator();

        while(itr.hasNext()){
            int n=itr.next();
            if(!visited[n]){
                traversal(n, visited);
            }
        }

    }

    public static void main(String[] args) {

        int v=4;
        
        boolean []visited=new boolean[v];

        DFStraversal obj=new DFStraversal(v);
        obj.addEdges(0,1);
        obj.addEdges(0,2);
        obj.addEdges(1,2);
        obj.addEdges(2,0);
        obj.addEdges(3,3);
        obj.addEdges(2,3);

        obj.printAdj();

        System.out.println("DFS traversal form 1: ");
        obj.traversal(1, visited);

        System.out.println("\nDFS traversal form 2: ");
        obj.traversal(2, new boolean[v]);
        
        System.out.println("\nDFS traversal form 3: ");
        obj.traversal(3, new boolean[v]);
        
        System.out.println("\nDFS traversal form 0: ");
        obj.traversal(0, new boolean[v]);
    }
}