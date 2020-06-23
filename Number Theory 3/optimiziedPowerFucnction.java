import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    int ans = optimiziedPower(n,p);
    System.out.println(ans);
    }
    public static int  optimiziedPower(int n, int p)
    {
        if(n==0)
            return 0;
        
        if(p==0 || n==1)
            return 1;
            
        int ans=1;
        for(int i=1;i<=(p/2);i++)
        {
            ans = ans*n;
        }
        if(p%2==0)
            return ans*ans;
        else
            return ans*ans*n;
    }
    
    
}
