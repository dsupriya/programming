
public class Solution {
    
	public static int getMaxMoney(int arr[], int n){

		/*Your class should be named Solution.
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/
        int [] dp = new int[n];
        dp[0]=arr[0];
        if(arr.length>=2)
        	dp[1]=Math.max(arr[0],arr[1]);
        //int sum =Math.max(arr[0],arr[1]);
    	for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    
    }
    public static int getMaxMoney_i(int arr[], int n)
    {
        int [] dp = new int[n];
        dp[0]=arr[0];
        if(n>=2)
        	dp[1]= Math.max(arr[0],arr[1]);
        int ans = getMaxMoney_r(arr,dp,2);
        return ans;
    }
    public static int getMaxMoney_r(int arr[], int []dp,int start)
    {
        /*if(start==0)
        {
            dp[0]=arr[0];
            return dp[0];
        }
        if(start==1)
        {
            dp[1]= Math.max(arr[0],arr[1]);
            return dp[1];
        }*/
        if(start>=arr.length-1)
        {
            return dp[arr.length-1];
        }
        dp[start] = Math.max((arr[start]+getMaxMoney_r(arr,dp,start+2)),getMaxMoney_r(arr,dp,start+1));
        return dp[start];
        

    }
    
}
