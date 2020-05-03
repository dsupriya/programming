
public class solution {
	public int solve(int n,int a[])
	{
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input. Input is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        int [] dp = new int[1001];
        dp[0]= 0;
        int [] f = new int [1001];
        for(int i=0;i<n;i++)
        {
            f[a[i]]++;
            
        }
        dp[1]=f[1];
        dp[2]=f[2]*2;
        
        for(int i=2;i<1001;i++)
        {
           dp[i]= Math.max((dp[i-2])+(i*f[i]),dp[i-1]);
            
        }
        return dp[1000];
    }
}
