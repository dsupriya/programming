
import java.lang.Math;
public class Solution {
    public static int frogJump(int n, int heights[]) {
	    

        // Iterative solution
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
==========
import java.lang.*;
public class Solution {
	
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
		// Brute Force
		int i = n - 1;
		if(i==0)
		{
			return 0;
		}
		if(i==1)
		{
			int diff = Math.abs(heights[i]-heights[i-1]);
			return diff;
		}
		
		int option1 = Math.abs(heights[i]-heights[i-1]) + frogJump(n-1,heights);
		int option2 = Math.abs(heights[i]-heights[i-2]) + frogJump(n-2,heights);
		
		return Math.min(option1, option2);
    }

}

==========
import java.lang.*;
import java.util.*;
public class Solution {
	
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
	// recursive_dp
		int [] dp = new int[n];
		Arrays.fill(dp,-1);
		frogJump_recursive_dp(n,heights,dp);
		return dp[n-1];
    }
	public static int frogJump_recursive_dp(int n, int heights[], int dp[]) {

        // Write your code here..
		// Brute Force
		int i = n - 1;
		if(dp[i]!=-1)
			return dp[i];
		if(i==0)
		{
			dp[0] = 0;
			return 0;
		}
		if(i==1)
		{
			
			int diff = Math.abs(heights[i]-heights[i-1]);
			dp[1] = diff;
			return diff;
		}
		
		int option1 = Math.abs(heights[i]-heights[i-1]) + frogJump_recursive_dp(n-1,heights,dp);
		int option2 = Math.abs(heights[i]-heights[i-2]) + frogJump_recursive_dp(n-2,heights,dp);
		int ans = Math.min(option1, option2);
		dp[i] = ans;
		return ans;
    }


}
