
public class Solution {
	
	
public static void placeNQueens(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Print output as specified in the question
	 */
    int [][]board = new int [n][n];
    queen(board,0);


	}
    public static boolean queen(int [][]board,int col)
    {
        if(col == board.length)
        {
            printSol(board);
            return true;
        }
        boolean res =false;
        for(int i=0;i<board.length;i++)
        {
            if(isSafe(board,i,col)==true)
            {
                board[i][col]=1;
                res =queen(board,col+1)||res;
                 board[i][col]=0;
            }
            
            
        }
        return res;
    }
    public static boolean isSafe(int [][]board, int row, int col)
    {
        int i,j;
        for( i=0;i<board.length;i++)
        {
            if(board[i][col]==1)
                return false;
        }
        for(i=0;i<board.length;i++)
        {
            if(board[row][i]==1)
                return false;
        }
        for(i=row,j=col;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]==1)
                return false;
        }
        for(i=row,j=col;i<board.length&&j>=0;i++,j--)
        {
            if(board[i][j]==1)
                return false;
        }
        return true;
        
    }
    public static void printSol(int [][]board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
        }
        System.out.println();
    }
	
}
