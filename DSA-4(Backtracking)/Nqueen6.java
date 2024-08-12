import java.util.Arrays;

public class Nqueen6{
    public static void printSolution(int [][]board,int n){
        for(var vx:board){
            System.out.println(Arrays.toString(vx));
        }
    }

    public static boolean isSafe(int [][]board,int row , int column, int n){
        int i,j;

        //check on the left row
        for(i=0;i<column;i++){
            if(board[row][i]==1)
            return false;
        }

        // check upper diagonal in left direction
        for(i=row, j=column; i>=0 && j>=0; i--,j--){
            if(board[i][j]==1)
            return false;
        }

        // check lower diagonal in left direction
        for(i=row,j=column; i<n && j>=0; i++,j--){
            if(board[i][j]==1)
            return false;
        }

        return true;
    }

    public static boolean solveNQueen(int [][]board, int column, int n){

        // base case --if you have placed all the queen then return true
        if(column>=n)
        return true;
        
        // consider this column and try to place all the queens in all the rows one by one
        for(int i=0;i<n;i++){

            //check if it is safe to place the queen or not 
            if(isSafe(board,i,column,n)){
                //place the queen on board
                board[i][column]=1;
            

                 // recursive call to place all the queens
                if(solveNQueen(board, column+1, n)){
                    return true;
                }

                 // if placing the queen does not lead to solution then backtrack
                board[i][column]=0;
            }
        }
        return false;

     // if it is not possible to place the queen in any row of the given colum return false

    }
    public static void main(String []args){
        // int [][]board={{0,0,0,0},
        //                 {0,0,0,0},
        //                 {0,0,0,0},
        //                 {0,0,0,0}};

        int [][]board=new int[4 ][4];

        int n=board.length;


        if(solveNQueen(board, 0, n)){
            printSolution(board, n);
        }
        else{
            System.out.println("no solution exists");
        }
    }
}