import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] a = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
       // int [] dp = new int [row];
        int k, max_sum, curr_sum,j;
        k=max_sum=curr_sum=0;
        max_sum=Integer.MIN_VALUE;
        for(int i=0;i<col;i++)
        { 
            k=0;
           int [] dp = new int [row];
            for( j=i;j<col;j++)
            {   
                for(k=0;k<row;k++)
                	dp[k] = dp[k]+a[k][j];
                 curr_sum= kadane_sum(dp);
                if(max_sum<curr_sum)
                    max_sum = curr_sum;
                
            }
           
        }
        System.out.println(max_sum);
        

	}
    public static int kadane_sum(int [] a)
    {
        int max_sum,cur_sum;
        max_sum=cur_sum=0;
        //max_sum=Integer.MIN_VALUE;
        
        
        for(int i=0;i<a.length;i++)
        {
            cur_sum=cur_sum+a[i];
            if(cur_sum<0)
                cur_sum=0;
            if(max_sum<cur_sum)
                max_sum=cur_sum;
        }
        if(max_sum==0)
        {
            java.util.Arrays.sort(a);
            return a[a.length-1];
        }
        else
        
            return max_sum;
    }

}
