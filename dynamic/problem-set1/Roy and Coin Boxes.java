import java.util.Scanner;

public class Main {   

	
	public static void main(String[] args) {
		// Write your code here\
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] box = new int[n+1];
        int [] coins = new int [1000001];
        //int []atleast = new int [1000001];
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int start = sc.nextInt();
            int end = sc.nextInt();
            while(start<=end)
            {
                box[start]++;
                start++;
            }
        }
        for(int i=0;i<n+1;i++)
        {
            coins[box[i]]++;
        }
        for(int i=coins.length-2;i>0;i--)
        {
            coins[i]=coins[i+1]+coins[i];
        }
        t = sc.nextInt();
        int q=0;
    	while(t>0)
        {
            t--;
            q = sc.nextInt();
            System.out.println(coins[q]);
            
        }
        
        

	}

}
