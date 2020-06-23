import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    int c = sc.nextInt();
    int ans = optimiziedPower(n,p,c);
    System.out.println(ans);
    }
    public static int  optimiziedPower(int n, int p, int c)
    {
        if(n==0)
            return 0;
        
        if(p==0 || n==1)
            return c;
            
        int ans=1;
        
        while(p>0)
        {
           if(p%2==1)
            {
                ans = (ans*n)%c;
            }
            n = (n*n)%c;
            p = p/2;
        }
        
        return ans;
            
    
    
}
}
