import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []a =new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n/2;i++)
        {
            sum=a[i]+a[n-1-i];
            System.out.println(sum/10+" "+sum%10);
        }
        
		
	}
}