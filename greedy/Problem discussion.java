import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int big,small,add,sub;
       	big = a[n-1]-k;
        small =a[0]+k;
        if(big<small)
        {
            int t = big;
            big=small;
            small=t;
        }
        int ans = big-small;
        for(int i=1;i<=n-2;i++)
        {
            add= a[i]+k;
            sub= a[i]-k;
            if(sub>=small || add<=big)
                continue;
            else
            {
                if(big-sub<=add-small)
                    small=sub;
                else
                    big=add;
            }
        }
        ans =Math.min(ans, big-small);
        System.out.println(ans);
        

	}

}
