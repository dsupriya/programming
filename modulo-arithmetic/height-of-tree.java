public class Solution {

	public static int balancedTreesOfHeightH(int h){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(h ==0||h==1)
        	return 1;
        
        else
        {
            int d = 1000000007;
            int x = balancedTreesOfHeightH(h-1) ;
            int y = balancedTreesOfHeightH(h-2);
            
        	int a = ((x%d)*(x%d))%d;
            int b = ((x%d)+(x%d))%d;
            int c = ((y%d)*(b%d))%d;
            int ans = ((a%d)+(c%d))%d;
           // int ans = (((x*x)%d) +((2*x*y)%d)) %d;
            return ans;
        }

	}
}
