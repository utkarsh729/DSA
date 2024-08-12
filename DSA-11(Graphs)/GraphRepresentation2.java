import java.util.*;
public class GraphRepresentation2 {
    public static void main(String[] args) {

        // 1-based indexing graph
        // for undirected graph ....using list

        int n=3; // number of nodes 1, 2, 3;

        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<n+1;i++){
            adjList.add(new ArrayList<Integer>());
        }

        // edge 1---2
        adjList.get(1).add(2);
        adjList.get(2).add(1);

        // if the graph is directed 1--->2
        // adjList.get(1).add(2);
        // adjList.get(2).add(1);  ... we  will not add this

        // edge 2---3
        adjList.get(2).add(3);
        adjList.get(3).add(2);

        // edge 1---3
        adjList.get(1).add(3);
        adjList.get(3).add(1);

        // if a edge present between nodes u and v in undirected graph 
        // adjList.get(u).add(v);
        // adjList.get(v).add(u);


        // for weighted graph store the pair ...if edge is present between 1---2 and weight is 5
        // adjList.get(1).add(2,5);


        for(int i=0;i<adjList.size();i++){
            System.out.print("Adjacency List is "+i+": ");
            for(int j=0;j<adjList.get(i).size();j++){
                System.out.print(adjList.get(i).get(j)+" ");
            }
            System.out.println();
        }


    }
}
