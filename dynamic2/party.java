import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int limit=sc.nextInt();
            int n  = sc.nextInt();
            if(limit==0&& n==0)
                break;
            int w[] = new int[n];
            int v[]= new int[n];
            for(int i=0;i<n;i++)
            {
                w[i]=sc.nextInt();
                v[i]=sc.nextInt();
            }
            int [] ans = new int[2];
			ans = calFun(w,v,limit);
            System.out.println(ans[0]+" "+ans[1]);
        }

	}
    public static int[] calFun(int [] w, int []v, int limit)
    {
        int [] ans = new int [2];
        int n = w.length;
        int [] [] dp = new int [n+1][limit+1];
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<limit+1;j++)
            {
                if(j>=w[i-1])
                {
                    dp[i][j] = Math.max(v[i-1]+dp[i-1][j-w[i-1]], dp[i-1][j]);
                }
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        ans [1]= dp[n][limit];
        int res = ans[1];
        int wt =  limit;
        int temp=0;
        
        for(int i = n ;i>0 && res>0;i--)
        {
            if(wt<=0)
                break;
            if(res==dp[i-1][wt])
                continue;
            else
            {
              temp=temp+w[i-1];
              res= res-v[i-1];
            	wt=wt-w[i-1];
                
            
            }
        }
        ans[0]=temp;
        return ans;
        
        
        
    }

}
