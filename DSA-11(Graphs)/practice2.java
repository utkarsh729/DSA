import java.util.*;
public class practice2 {
    public static void main(String[] args) {
        int [][]edges={{0,1}, {1,2},{0,2}};
        double []prob={0.5, 0.5,0.2};
        int n=3;

        ArrayList<ArrayList<ArrayList<Double>>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int startNode=edges[i][0];
            int endNode=edges[i][1];

            ArrayList<Double> al=new ArrayList<>();
            al.add((double)endNode);
            al.add(prob[i]);

            adj.get(startNode).add(al);

            al.clear();
            al.add((double)startNode);
            al.add(prob[i]);
            adj.get(endNode).add(al);
        }

        // PriorityQueue<double []> pq=new PriorityQueue<>((a,b) -> (int)b[1]-(int)a[1]);

        

        System.out.println(adj);
    }
}
