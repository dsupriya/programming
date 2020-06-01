import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            ArrayList <ArrayList<Integer>> list = new <ArrayList<Integer>>ArrayList();
            int n = sc.nextInt();
            int e = sc.nextInt();
            for(int i=0;i<n;i++)
                list.add(i, new ArrayList<Integer>());
            while(e>0)
            {
                e--;
                int t1 = sc.nextInt();
                int t2 = sc.nextInt();
                t1--;
                t2--;
                list.get(t1).add(t2);
                list.get(t2).add(t1);
            }
            int a[] = new int[n];
            for(int i=0;i<n;i++)
            	a[i] = sc.nextInt();
            int ans = maxBanana(list,a,n);
            System.out.println(ans);


            
        }

	}
    public static int maxBanana(ArrayList <ArrayList<Integer>> list,int []a, int n)
    {
        //ArrayList <ArrayList<Integer>>comp = new <ArrayList<Integer>>ArrayList();
        boolean visited[] = new boolean[n];
        int cur,max = 0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                ArrayList <Integer> l1 = new <Integer>ArrayList();
                DFS(list,l1,visited,i);
                cur = findProfit(l1,a);
                if(max<cur)
                    max= cur;
            }
        }
        
        
        return max;
    }
    public static int findProfit(ArrayList <Integer> l1, int[]a)
    {
        Iterator it =l1.iterator();
        int cur=0;
        while(it.hasNext())
        {
            int value =(int)it.next();
            cur = cur + a[value];
                
        }
        return cur;
    }
    public static void DFS(ArrayList <ArrayList<Integer>> list, ArrayList <Integer> l1,boolean [] visited,int start)
    {
        
        visited[start] = true;
        l1.add(start);
        
        
        Iterator itr = list.get(start).iterator();
        while(itr.hasNext())
        {
            int t = (Integer)itr.next();
            if(visited[t] == false)
                DFS(list,l1,visited,t);
        }
        return;
    }
    

}
