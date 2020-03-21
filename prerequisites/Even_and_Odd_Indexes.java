import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] a= new int[n];
        int even_sum=0;
        int odd_sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i%2==0 && a[i]%2==0)
                even_sum=even_sum+a[i];
            else
            {
                if(i%2!=0 && a[i]%2!=0)
                    odd_sum=odd_sum+a[i];
            }
        }
        System.out.println(even_sum+" "+odd_sum); 
		
	}
}