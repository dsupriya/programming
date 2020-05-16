
public class Solution {

	
	public static int editDistance(String s1, String s2){
		
	/* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
    */
        int n =  s1.length();
        int m = s2.length();
        n++;
        m++;
        int [][] dp = new int [n][m];
        dp[0][0]=0;
        for(int i=1;i<m;i++)
            dp[0][i]=i;
        for(int i=1;i<n;i++)
            dp[i][0]=i;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                int min =Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=1+min;
            }
        }
        return dp[n-1][m-1];
        

	}

	  
}
