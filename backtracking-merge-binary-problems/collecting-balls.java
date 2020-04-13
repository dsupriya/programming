import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        long min=0;
        long max=n;
        long k=n;
        long mid=0;
        if(n==1)
        {
            System.out.println("1");
            return;
        }
        while(min<=max)
        {
            
            mid=(min+max)/2;
            
            if(isPossiable(n,mid)==true)
            {
                max=mid-1;
                if(mid<=k)
                k=mid;
                
            }
            else
                min =mid+1;
            
        }
        if(n%2==0)
        System.out.println(k);
		else
            System.out.println(k+1);

            
	}
    public static boolean isPossiable(long n, long mid)
    {
        long sharma=0;
        long singh=0;
        long ball=n;
        while(n>0)
        {
            if(n<mid)
            {
                sharma=sharma+n;
                n=0;
                break;
            }
            sharma=sharma+mid;
            n=n-mid;
            singh=singh+(n/10);
            n=n-(n/10);
        }
        if(sharma>=(ball/2))
            return true;
        else
            return false;
        
    }
}
