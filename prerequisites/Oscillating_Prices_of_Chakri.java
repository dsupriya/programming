import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        int min, max,temp;
        min =Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                temp = a[j]-a[i];
                if(temp>max)
                    max=temp;
                
            }
                
        }
        
        
        System.out.println(max);

	}
	}