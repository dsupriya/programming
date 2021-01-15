//sample build-and-query-fenwick-tree.java for sum of array
/*
Sample input :
5
1 2 3 4 5
1
0 5

out put:
----
1
3
3
10
5
----
0 5 1
Ans 15
Query can be - give the sum of between incides  x and y


*/
import java.util.*;
public class Fenwick{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n+1];
        int []BIT = new int[n+1];
        System.out.println("----");
        for(int i =1;i<=n;i++)
        {
            a[i] = sc.nextInt(); 
            update(i,a[i],BIT);
            //System.out.print(a[i]+" ");
        }
        System.out.println("----");
        int q = sc.nextInt();
         
            
 
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            System.out.println(t1+" "+t2+" "+q);
            int ans1 = query(t1,BIT);
            int ans2 = query(t2,BIT);
            int ans =  ans2 - ans1;
            System.out.println("Ans "+ans);
            q--;
        
    }
    
    public static void update(int index, int value, int []BIT)
    {
        int t = index;
        int n = BIT.length;
        while(index<n)
        {
            BIT[index] =  BIT[index] + value;
            index = index + (index&(-index));
        }
        System.out.println(BIT[t]);
    }
    
    public static int query(int index,  int []BIT)
    {
        
        int n = BIT.length;
        int sum = 0;
        //System.out.println("query "+index);
        
        while(index>0)
        {
            //System.out.println("query "+index);
            sum =  BIT[index] + sum;
            index = index - (index&(-index));
        }
        
        return sum;
    }
}
