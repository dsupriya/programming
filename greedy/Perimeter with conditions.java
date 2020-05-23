import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        /* Your class should be named Main.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        
        int [] ans = new int [3];
        int [] prev = new int[3];
        int cur,max=0;
        for(int i=n-1;i>=2;i--)
        {
            if(isTriangle(a[i],a[i-1],a[i-2])==true)
            {
                cur= a[i]+a[i-1]+a[i-2];
                if(max<cur)
                {
                    ans[0]=a[i-2];
                    ans[1]=a[i-1];
                    ans[2]=a[i];
                    max=cur;
                }
                /*else if(max == cur && a[i] > ans[2])
                {
                    ans[0]=a[i-2];
                    ans[1]=a[i-1];
                    ans[2]=a[i];
                    max=cur;
                }
                else if(max == cur && a[i] == ans[2] )
                {
                    prev = ans;
                    if(ans[0]<a[i-2])
                    { 
                    	ans[0]=a[i-2];
                    	ans[1]=a[i-1];
						ans[2]=a[i];
                   	 	max=cur;    
                    }
                }*/
            }
        }
        if(ans[0]==0&&ans[1]==0&&ans[2]==0)
        {
            System.out.println("-1");
        }
        else
            System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
            
        
    }
    public static boolean isTriangle(int a, int b, int c)
    {
        if(a+b>c && b+c>a && a+c>b)
            return true;
        else
            return false;
    }
    
}
