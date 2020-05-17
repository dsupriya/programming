import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++)
        	a[i] = sc.nextInt();
        int sum = sc.nextInt();
        boolean [][] dp = new boolean [n+1][sum+1];
        for(int i=0;i<n+1;i++)
        	dp[i][0] = true;
        dp[0][0] = true;
        
        for(int i = 1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                dp[i][j] = dp[i-1][j];
                if(a[i-1]<=j)
                {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i-1]];
                }
            }
        }
        if(dp[n][sum]== true)
            System.out.println("Yes");
        else
            System.out.println("No");
            
	}

}
