import java.util.*;
public class ratMatrix_5 {

  
  public static void solveMaze(ArrayList<String> ans, int r, int c, int n, int [][]maze, boolean [][]visited, String p){
    if(r==n-1 && c==n-1 && maze[r][c]!=0){
      ans.add(p);
      return;
    }
    if(r<0 || c<0 || r>=n || c>=n || maze[r][c]==0 || visited[r][c]==true){
      return;
    }
    visited[r][c]=true;
    solveMaze(ans, r+1, c, n, maze, visited, p+"D");  // down 
    solveMaze(ans, r, c+1, n, maze, visited, p+"R");  // right
    solveMaze(ans, r-1, c, n, maze, visited, p+"U");  // up
    solveMaze(ans, r, c-1, n, maze, visited, p+"L");  // left
    visited[r][c]=false;
  }
  public static ArrayList<String> totalPaths(int [][]maze, int n){
    ArrayList<String> ans=new ArrayList<>();
    boolean visited[][]=new boolean[n][n];
    solveMaze(ans, 0, 0, n, maze, visited, "");
    return ans;
  }

  public static void main(String[] args) {

    int maze[][]={{1,1,0,0},
                  {1,1,0,1},
                  {1,0,0,0},
                  {1,1,1,1}};

    

    ArrayList<String> ans=new ArrayList<>();
    ans=totalPaths(maze,4);
    System.out.println(ans);


  
  }
}
