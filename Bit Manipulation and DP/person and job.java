import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                a[i][j] = sc.nextInt();
        }
        int size = (1<<n);
        System.out.println(size);
        int []dp = new int[size];
        for(int i=0;i<size;i++)
        {
            dp[i] = Integer.MAX_VALUE;
            
        
            
        }
        int ans = minCostForJob(a,dp,n,0,0);
        System.out.println(dp[0]);
        
      
    }
    public static int  minCostForJob(int [][]a,int []dp,int n,int p,int mask)
    {
        if(p>=n)
            return 0;
        if(dp[mask]!=Integer.MAX_VALUE)
            return dp[mask];
        
        int minimum = 1000;
        for(int j=0;j<n;j++)
        {
            if(((mask)&(1<<j))==0)
            {
                int ans = minCostForJob(a,dp,n,p+1,mask | 1<<j) + a[p][j];
                if(ans<minimum)
                    minimum = ans;
            }
        }
        dp[mask] = minimum;
        return minimum;
        
    }
        
}
