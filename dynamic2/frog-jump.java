import java.lang.Math;
public class Solution {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
		int [] dp = new int[n];
		if (n==1)
			return 0;
		if(n==2)
		{
			int diff = heights[0] - heights[1];
			return Math.abs(diff);
		}
		dp[0] = 0;
		dp[1] = Math.abs(heights[0] - heights[1]);
		
		
		for(int i=2;i<n;i++)
		{
			dp[i] = Math.min((dp[i-2]+Math.abs(heights[i]-heights[i-2])),
							 (dp[i-1]+Math.abs(heights[i]-heights[i-1])));
		}
		return dp[n-1];
		
		
    }

}
