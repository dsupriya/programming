import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int []seive = new int[1000001];
        int [][] factor = createSeive(seive);
        while(t>0)
        {
            t--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ans = factor[c][b] - factor[c][a-1];
            System.out.println(ans);
        }

	}
    public static int [][] createSeive(int []seive)
    {
        int n = seive.length;
        int root = (int)Math.ceil(Math.sqrt(n));
        for(int i=2;i<n;i++)
            seive[i] = -1;
        for(int i=2;i<n;i++)
        {
            if(seive[i]==-1)
            { 	//seive[i] = 1;
                for(int j = i;j<n;j=j+i)
            	{
                	if(seive[j]==-1)
                        seive[j] =1;
                	else
                        seive[j]++;
            	}
            }
        }
        /*for(int i=2;i<11;i++)
           System.out.print(i+" "+seive[i]+"| ");*/
        
        System.out.println();
        int factor[][] = new int [11][n];
        for(int i=0;i<11;i++)
        {
            int k=0;
            for(int j=1;j<n;j++)
            {
                if(seive[j] == i)
                    k++;
                factor[i][j] =k;
            }
        }
        return factor;
    }

}
