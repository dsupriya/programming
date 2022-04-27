import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		int[] arr = nums.stream().mapToInt(i -> i).toArray();
		int n = arr.length;
		if(n==1)
			return arr[0];
		if(n==2)
		{
			return Math.max(arr[0],arr[1]);
		}
		int dp[] = new int[n];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0],arr[1]);
		
		for(int i=2;i<n;i++)
		{
			int op1 = dp[i-1];
			int op2 = dp[i-2]+arr[i];
			dp[i] = Math.max(op1,op2);
		}
		return dp[n-1];
	}
}

//time = o(n)
//space = o(n) can be further optimised 
