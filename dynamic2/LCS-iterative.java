
public class Solution {

	
	public static int lcs(String s1, String s2){
		
	/* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	*/
    	int n = s1.length();
    	int m = s2.length();
        n++;
        m++;
        int [][] dp = new int [n][m];
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]= 1+dp[i-1][j-1];
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n-1][m-1];
	
	}

	
}
