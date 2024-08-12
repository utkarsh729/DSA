import java.util.Arrays;

public class GraphRepresentation1 {
    public static void main(String[] args) {

        // for undirected graph..using adjacency matrix

        int n=3;  // no. of nodes in graph 1, 2, 3 

        int [][]adj=new int[n+1][n+1];

        // edge between 1---2
        adj[1][2]=1;
        adj[2][1]=1;
        // for weighted graph write the corresponding weight in place of 1

        // edge between 2---3
        adj[2][3]=1;
        adj[3][2]=1;

        // for undirected graph if a edge present between nodes u and v ..we can store it in adjacency matrix like
        // adj[u][v]=1;
        // adj[v][u]=1;


        System.out.println(Arrays.deepToString(adj));

    }
}
