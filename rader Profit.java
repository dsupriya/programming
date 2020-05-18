import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int k = sc.nextInt();
            int n = sc.nextInt();
            int []a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            int ans = calProfit(a,n,k);
            System.out.println(ans);
        }

	}
    public static int calProfit(int []a, int n, int k)
    {
        int [][]dp = new int[k+1][n];
        int max=0;
        
        for(int i=1;i<=k;i++)
        {
            max= - a[0];
            for(int j=1;j<n;j++)
            {
                dp[i][j] = Math.max(dp[i][j-1],a[j]+max);
                max= Math.max(max,dp[i-1][j]-a[j]);
            }
        }
        return dp[k][n-1];
    }

}
