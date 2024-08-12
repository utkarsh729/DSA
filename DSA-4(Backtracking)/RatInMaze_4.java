public class RatInMaze_4 {

    // i ,j starting point 
    //di, dj destination point

    public static void ratInMaze(int [][]arr,int i,int j, int di, int dj,String str){
        if(i==di && j==dj){
          System.out.println(str);
          return;
        }
        else{
          if(j<dj)
            if(arr[i][j+1]==1){
              ratInMaze(arr, i, j+1, di, dj, str+'R');
            }
          if(i<di)
            if(arr[i+1][j]==1){
              ratInMaze(arr, i+1, j, di, dj, str+'D');
            }
    
        }
    
      }
    
    public static void main(String[] args) {

        int [][]maze={  {1,0,0,1},
                        {1,1,0,0},
                        {0,1,1,0},
                        {0,1,1,1}
                    };
        ratInMaze(maze, 0, 0, 3,3, "");

        System.out.println("done");
       
        
    }
}
