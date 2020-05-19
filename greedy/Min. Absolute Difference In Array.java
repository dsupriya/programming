import java.util.*;
public class Solution {

	public static int minAbsoluteDifference(int a[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
         int 
		 */
        
        int n = a.length;
        Arrays.sort(a);
        int ans= Integer.MAX_VALUE;
        int curr=0;
        for(int i=1;i<n;i++)
        {
            curr = Math.abs(a[i-1] - a[i]);
            if(curr<ans)
                ans=curr;
        }
        return ans;
        

	}

}
