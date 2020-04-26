import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int row = sc.nextInt();
            int col = sc.nextInt();
            int [][]arr = new int[row][col];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            magicGrid(arr,row,col);
        }
            
    }
    public static void magicGrid(int [][]arr, int row, int col)
    {
        int [][]dp = new int [row][col];
        dp[row-1][col-1]=1;
       // dp[row-2][col-1]=1;
        //dp[row-1][col-2]=1;
        int last_row=row-1;
        int last_col = col-1;
        int right,bottom;
        for(int i=col-2;i>=0;i--)
        {
            if(dp[last_row][i+1] - arr[last_row][i]>0)
            	dp[last_row][i] = dp[last_row][i+1] - arr[last_row][i];  
            else
                dp[last_row][i]=1;
                
        }
        for(int i= row-2;i>=0;i--)
        {
            if(dp[i+1][last_col] - arr[i][last_col]>0)
            dp[i][last_col] = dp[i+1][last_col] - arr[i][last_col];
            else
                dp[i][last_col]=1;
                
        }
        for(int i = row-2;i>=0;i--)
        {
            for(int j= col-2;j>=0;j--)
            {
            	right = dp[i][j+1]-arr[i][j];
            	bottom = dp[i+1][j] - arr[i][j];
                if(right>0 && Math.min(right,bottom)==right)
                    dp[i][j]=right;
                else if(bottom>0 && Math.min(right,bottom)==bottom )
                    dp[i][j]=bottom;
                else
                    dp[i][j]=1;
            }
        }
        	/*for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                     System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }*/
         System.out.println(dp[0][0]);
        
        
        
    }

}
