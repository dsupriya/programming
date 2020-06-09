import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1)
        { 
            System.out.println(0);
            return;
        }
        int ans =1;
        for(int i =3;i<=n;i++)
        {
            if(isPrime(i)==true)
                ans++;
        }
        System.out.println(ans);
        
        
        

	}
    public static boolean isPrime(int n)
    {
        int root = (int)Math.ceil(Math.sqrt(n));
        //System.out.println(root);
        
        for(int i=2;i<=root;i++)
        {
            if(n%i == 0)
                return false;
        }
        
        return true;
    }

} 
