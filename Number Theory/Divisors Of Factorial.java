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
            ArrayList <Integer>prime = getPrimeSeive(n);
            long ans = getDivisorsOfFactorial(prime,n);
            System.out.println(ans);
        }
        
        

	}
    public static long getDivisorsOfFactorial(ArrayList <Integer>prime,int n)
    {
        ArrayList <Integer> index = new ArrayList<Integer>();
        int mod = 1000000007;
        long ans=1;
        Iterator itr = prime.iterator();
        while(itr.hasNext())
        {
        	int cur_prime = (int)itr.next();
           	int t = getIndex(cur_prime,n);
            index.add(t);
        }
        itr = index.iterator();
        while(itr.hasNext())
        {
            int cur_prime = (int)itr.next();
            //System.out.print(cur_prime+" ");
            ans = ((ans)*(cur_prime+1))%mod;
        }
        return ans;
    }
    
    public static int getIndex(int prime,int n)
    {
        int k=1;
        int ans=0;
        int power = (int)Math.pow(prime,k);
        
        while(power<=n)
        {
            
            
            ans = ans+(n/power);
            k++;
            power = (int)Math.pow(prime,k);
            
            
        }
        return ans;
    }
    
    
    public static ArrayList <Integer> getPrimeSeive(int n)
    {
        ArrayList <Integer>prime = new ArrayList<Integer>();
        
        boolean visited[] = new boolean[n+1];
        for(int i=2;i<n+1;i++)
            visited[i] = true;
        int root = (int)Math.ceil(Math.sqrt(n));
        for(int i=2;i<=root;i++)
            updateMultiplicants(i,visited);
        
        for(int i=0;i<n+1;i++)
        {
            if(visited[i]==true)
                prime.add(i);
                
        }
        return prime;
    }
    public static void updateMultiplicants(int j, boolean []visited)
    {
        int n = visited.length;
       	for(int i = j*j;i<n;i=i+j)
            visited[i] = false;
        
    }

}
