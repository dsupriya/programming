
public class Solution {
	
		
public static long staircase(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
    long [] a= new long[n+1];
    //long ans = myStaircase(a,n);
    long ans = myStaircase_i(n);
    return ans;

	}
    public static long myStaircase(long []a, int n)
    {
        if(n<=0)
            return 1;
        if(n==1)
            return 1 ;
        if(n==2)
            return 2;
        
        if(a[n]!=0)
            return a[n];
        
        
            long ans = myStaircase(a,n-1)+myStaircase(a,n-2)+myStaircase(a,n-3);
            a[n]=ans;
            return ans;
        
        
        
    }
    public static long myStaircase_i(int n)
    {
        long output[] = new long[n+1];
        if(n<=0)
            return 1;
        if(n==1)
            return 1 ;
        if(n==2)
            return 2;
        output[0]=output[1]=1;
        output[2]=2;
        for(int i=3;i<output.length;i++)
        {
            output[i]=output[i-1]+output[i-2]+output[i-3];
        }
        return output[n];
        
    }
	
}
