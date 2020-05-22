import java.util.*;
// greedy + dynamic approch
public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s,e,p;
        Item [] ival = new Item[n];
        for(int i=0;i<n;i++)
        {
            s=sc.nextInt();
            e=sc.nextInt();
            p=sc.nextInt();
            
            ival[i] = new Item(s,e,p);
        }
       
        Arrays.sort(ival, new Comparator<Item>()
        {
             @Override
            public int compare(Item o1, Item o2)  
            { 
                return  o1.end.compareTo(o2.end) ; 
            } 
        });
        int []dp=new int[n];
        dp[0]=ival[0].profit;
        int last=-1;
        for(int i=1;i<n;i++)
        {
            last = -1;
            for(int j=i-1;j>=0;j--)
            {
                if(ival[i].start>=ival[j].end)
                {
                    last=j;
                    break;
                }
            }
            if(last == -1)
                 dp[i] = Math.max(ival[i].profit,dp[i-1]);
            else
                dp[i] = Math.max(dp[last]+ival[i].profit,dp[i-1]);
               
        }
        System.out.println( dp[n-1]);
    }
	public static class Item
    {
        Integer start,end,profit;
        Item(int start,int end,int profit)
        {
            this.start=start;
            this.end=end;
            this.profit = profit;
        }
    }

}
