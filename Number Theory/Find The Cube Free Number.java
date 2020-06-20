import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int []seive = new int[1000002];
        createSeiveArray(seive);
       	for(int i=1;i<=t;i++)
        {
           	int n = sc.nextInt();
            int ans = seive[n];
            if(ans==-1)
            	System.out.println("Case "+i+": Not Cube Free");
            else
                System.out.println("Case "+i+": "+ans);
        
           
        }
         

	}
    public static void createSeiveArray(int [] seive)
    {
        int n = seive.length;
       
        for(int i=2;i<100;i++)
        {
            int cube = i*i*i;
            int index =cube;
            
            for(int j=1;j<n && index<n;j++)
            {
                index = cube*j;
                if(index>=n)
                    break;
            	seive[index] =-1;
            }
        }
        /*for(int i=0;i<37;i++)
            System.out.print(i+" "+seive[i]+" |");*/
        System.out.println();
        int k=0;
        for(int i=1;i<n;i++)
        {
            if(seive[i]!=-1)
            {
             	k++;
            	seive[i] = k;   
            }  
        }
        
        
        
    }
    

}
