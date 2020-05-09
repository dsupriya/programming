import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here\
        
        int mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int dp[][] = new int[n][101];
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<101;j++)
            {
                if(a[i]==j)
                {
                    dp[i][j]=1;
                    break;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>=0;j--)
            {
                
                if(a[j]<a[i])
                {
                    for(int k=1;k<101;k++)
                    {
                        int ngcd = gcd(a[i],k);
                        dp[i][ngcd] = (dp[i][ngcd]+dp[j][k])%mod;
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
            count=(count+dp[i][1])%mod;
        System.out.println(count);
        

	}
    public static int gcd(int a, int b)
    {
        if (b == 0)
        	return a;
    	if (b == 1)
        	return 1;
    	if (b > a)
        	return gcd(b, a);
    	int mod = a%b;
    	return gcd(b, mod);
    }

}
