import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int [] a  = new int[n];
        boolean isSame = true;
        int min = 1001;
        int max = 0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]<min)
                min= a[i];
            if(a[i]>=max)
                max= a[i];
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                isSame=false;
                break;
            }
        }
        if(isSame== true)
        {
            System.out.println("0");
            return;
        }
        int temp;
        int ans=Integer.MAX_VALUE;
        for(int i=min;i<=max;i++)
        {
           temp = calValue(a,i,k,l);
            if(temp<ans)
                ans=temp;
            
        }
        System.out.println(ans);

	}
    public static int calValue(int []a, int n, int k, int l)
    {
     
        int less, more,ans;
        less=more=ans=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<n)
                less = less+(n- a[i]);
            else
                more= more+(a[i]-n);
                
                
        }
        if(less>=more)
        {
            ans = ((more)*k)+((less-more)*l);
            return ans;
            
        }
        else
            return Integer.MAX_VALUE;
    
    }

}
