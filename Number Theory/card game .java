import java.util.Scanner;
import java.math.BigInteger; 
import java.math.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []a= new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int ans = cardGame(a,n,k);
        System.out.println(ans);
            

	}
    public static int cardGame(int []a,int n , int k)
    {
        int ans=0;
        BigInteger d = new BigInteger(""+k);
        BigInteger zero = new BigInteger("0");
        for(int i=0;i<n;i++)
        {
            BigInteger f = new BigInteger("1");
            for(int j= i;j<n;j++)
            {
                f  = f.multiply(BigInteger.valueOf(a[j]));
                //p = p*a[j];
                BigInteger c = f.mod(d);
                if(c.equals(zero))
                {
                    ans  = ans+(n-j);
                    break;
                }
            }
        }
        return ans;
    }

}
