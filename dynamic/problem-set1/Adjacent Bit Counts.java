import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int mod = 1000000007;
        while(t>0)
        {
            t--;
            int rno= sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [][][] dp = new int [n+1][k+1][2];
           // dp = inti_dp(dp);
            for(int i=0;i<n+1;i++)
            {
                for(int j=0;j<k+1;j++)
                {
                    for(int k1=0;k1<2;k1++)
                        dp[i][j][k1] = -1;
                }
            }
            //System.out.println(n+" "+k);
            int ans = (getBitCount(n,k,dp,0)+getBitCount(n,k,dp,1))%mod;
            System.out.println(rno+" "+ans);
        }

	}

    public static int getBitCount(int n, int k, int [][][]dp, int start)
    {
        
        //System.out.println(n+" "+k);
        int mod = 1000000007;
        int op1, op2;
        
        if(n==1)
        {
            if(k==0)
                return 1;
            else 
                return 0;
        }
        if(k<0)
            return 0;
        if(dp[n][k][start]!=-1)
            return dp[n][k][start];
        if (start ==0)
        {
            dp[n][k][start] = (getBitCount(n-1,k,dp,0)%mod + getBitCount(n-1,k,dp,1)%mod)%mod; 
            return dp[n][k][start];
        }
        else
        {
            dp[n][k][start]= (getBitCount(n-1,k-1,dp,1)%mod +getBitCount(n-1,k,dp,0)%mod)%mod;
            return dp[n][k][start];
        }
        
        
        
       /* if(start==0)
        {
           if(dp[n-1][k][0]!=-1)
           {
               op1=dp[n-1][k][0];
           }
            else
            {
               op1=getBitCount(n-1,k,dp,0); 
               //dp[n-1][k][0]=op1;
            }
               
            if(dp[n-1][k][1]!=-1)
            {
                 op2=dp[n-1][k][1];
           	}
            else
            {
               op2=getBitCount(n-1,k,dp,1);
               //dp[n-1][k][1] =op2;
            }
            dp[n][k][start] = (op1+op2)%mod;
                
            
            return (op1+op2)%mod;
        }
        else
        {
           if(dp[n-1][k-1][1]!=-1)
           {
               op1=dp[n-1][k-1][1];
           }
            else
            {
                op1=getBitCount(n-1,k-1,dp,1); 
                //dp[n-1][k-1][1]=op1;
                
            }
               
            if(dp[n-1][k][0]!=-1)
            {
                 op2=dp[n-1][k][0];
           	}
            else
            {
                op2=getBitCount(n-1,k,dp,0); 
                //dp[n-1][k][0]=op2;
            }
            dp[n][k][start] = (op1+op2)%mod;
               
            return (op1+op2)%mod;
        }*/
        
        
    }

}
