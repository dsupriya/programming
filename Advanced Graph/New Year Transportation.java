import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int [] a = new int[n];
        for(int i=1;i<n;i++)
            a[i] = sc.nextInt();
        int end =n;
        int curr,next,i;
        i=1;
        curr=1;
        while(i<n || end>0)
        {
            end--;
            i =i+a[i];
            if(i>=n)
            {
                System.out.println("NO");
                	return;
            }
            if(i == t)
            {
                System.out.println("YES");
                return;
            }
            else if(i>t)
            {
                 System.out.println("NO");
                	return;
            }
            
            
            
        }
         System.out.println("NO");
        	return;

	}

}
