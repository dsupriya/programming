
public class Solution {

	public static int getMin(int a[], int n){
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output.
	 	 * Taking input is handled automatically.
		 */
        int [] dp = new int[n];
        dp[0]=1;
      
        
        for( int i=1;i<n;i++)
        {
             if(a[i-1]<a[i])
                 dp[i]=dp[i-1]+1;
            else
                dp[i]=1;
           
        }
        for(int i=n-2;i>=0;i--)
        {
           if(a[i]>a[i+1]&&dp[i]<=dp[i+1])
               dp[i]=dp[i+1]+1;
        }
        int sum =0;
        for(int i=0;i<n;i++)
        {
            //System.out.println(dp[i]);
            sum =sum+dp[i];
        }
        return sum;
  }
}
