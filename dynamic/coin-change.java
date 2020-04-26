
public class Solution {

	
	public static int countWaysToMakeChange(int denominations[], int value){

			
    int [][] output = new int [value+1][denominations.length+1];
        for(int i=0;i<value+1;i++)
        {
            for(int j=0;j<denominations.length+1;j++)
                output[i][j]=-1;
        }
        int ans = coinChange(value, denominations, 0,output );
        return ans;

	}
    public static int coinChange(int value, int [] d, int start,int [][]output)
    {
        if(value<0)
            return 0;
        if(value == 0)
            return 1;
        if(start== d.length)
            return 0;
        
        if(output[value][start]>-1)
            return output[value][start];
        int include = coinChange(value-d[start],d,start,output);
        
        int exclude =coinChange(value,d,start+1,output);
        output[value][start]= include+exclude;
        return output[value][start];
        
    }
	
}
