import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int []a = new int [n];
            for(int i=0;i<n;i++)
            {
                a[i]= sc.nextInt();
            }
            if(isSortingSkill(a)==true)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
	}
    public static boolean isSortingSkill(int []a)
    {
        int temp;
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1]&& a[i]-a[i+1]==1)
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
                return false;
        }
        return true;
    }
}
