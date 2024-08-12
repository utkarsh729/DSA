import java.util.*;

/**
 * practice4
 */
public class practice {

    public static void main(String[] args) {
        int [][]edges={{0,1},{0,2},{2,1}};


       ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

       for(int i=0;i<edges.length;i++){
            adj.add(new ArrayList<>());
       }

       for(int i=0;i<edges.length;i++){
        
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
       }

       System.out.println(adj);

       ArrayList<Integer> []list=new ArrayList[3];

       for(int i=0;i<3;i++){
        list[i]=new ArrayList<>();
       }

       for(int []edge:edges){
        int startNode=edge[0];
        int endNode=edge[1];

        list[startNode].add(endNode);
        list[endNode].add(startNode);
       }

       System.out.println(Arrays.toString(list));

    
    }
}