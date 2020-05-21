/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    t--;
		    int n = sc.nextInt();
		    int wt = sc.nextInt();
		    int [] val = new int[n];
		    int []w = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        val[i]=sc.nextInt();
		        w[i]=sc.nextInt();
		    }
		    double ans = knapsack(val,w,wt);
		    String s= String.format("%.2f", ans);
		    System.out.println(s);
		}
		
	}
	public static double knapsack(int []val,int []w, int wt)
    {
        int n = val.length;
        Item [] ival =new Item[n];
        for(int i=0;i<n;i++)
        {
            ival[i] = new Item(val[i],w[i]);
        }
        //sort
        Arrays.sort(ival, new Comparator<Item>()  
        { 
            @Override
            public int compare(Item o1, Item o2)  
            { 
                return  o2.cost.compareTo(o1.cost) ; 
            } 
        });
        double ans=0;
        double cur=wt;
        for(int i=0;i<n;i++)
        {
            if(ival[i].weight<=cur)
            {
                ans = ans + ival[i].v;
                cur=cur-ival[i].weight;
            }
            else
            {
                
                ans = ans+ (float)(cur* ival[i].cost);
                break;
            }
            if(cur<=0)
                break;
            
        }
        return ans;
        
    }
    public static class Item
    {
        Double v,weight;
        Double cost;
        Item(double v, double weight)
        {
            this.v =v;
            this.weight=weight;
            this.cost = v/weight;
        }
    }
}
