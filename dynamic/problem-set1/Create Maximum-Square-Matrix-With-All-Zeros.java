
public class Solution {
	
	public static int findMaxSquareWithAllZeros(int[][] input){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
        int row =input.length;
        int col = input[0].length;
        int [][] dp = new int [row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(input[i][j]==0)
                	dp[i][j]=1;
            }
        }
        int up, left, dia;
        
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                if(dp[i][j] == 0)
                    continue;
                up=dp[i-1][j];
                left=dp[i][j-1];
                dia=dp[i-1][j-1];
                dp[i][j] = Math.min(up,Math.min(left,dia))+dp[i][j];
            }
        }
        int max=0;
        int max_i,max_j;
        max_i=max_j=0;
    	for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
            	if(dp[i][j]>max)
                {
                    max_i=i;
                  max=dp[i][j]; 
    				max_j=j;
                }
                    
            
            }
        }
        //System.out.println(max_i+" "+max_j);
        return max;

	}

	
}
