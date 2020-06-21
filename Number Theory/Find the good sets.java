import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int n = sc.nextInt();
            int []a = new int [n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            int ans = findGoodSets(a,n);
            System.out.println(ans);
        }
        

	}
    public static int findGoodSets(int []a, int n)
    {
     	Arrays.sort(a);
        int seive[] = new int[n];
        for(int i=0;i<n;i++)
            seive[i]=1;
        int ans=0;
        
        for(int i =0;i<n;i++)
        {
           
            int d = a[i];
            for(int j=i+1;j<n;j++)
            {
                
                if(a[j]%d==0)
                {
                    seive[j] =seive[j]+seive[i];
                }
            }
            ans=ans+seive[i];
        }
        
        
            
        return ans;
    }

}
