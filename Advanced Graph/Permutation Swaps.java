import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int n = sc.nextInt();
            int e = sc.nextInt();
            int [] p = new int[n];
            int [] q = new int[n];
            for(int i=0;i<n;i++)
            	p[i] = sc.nextInt();
            for(int i=0;i<n;i++)
            	q[i] = sc.nextInt();
            int [][] graph = new int[n][n];
            while(e>0)
            {
                e--;
                int t1= sc.nextInt();
                int t2 = sc.nextInt();
                graph[t1-1][t2-1] = 1;
                graph[t2-1][t1-1] = 1;
            }
            
            String ans = permutationSwaps(graph,p,q);
            System.out.println(ans);
        }
    }
        
        public static String permutationSwaps(int [][] graph, int [] p, int []q)
        {
            int n = p.length;
         	boolean [] visited = new boolean[n];  
            LinkedList <LinkedList>list = new LinkedList<LinkedList>();
            
            for(int i=0;i<n;i++)
            {
                if(visited[i]==false)
                {
                    LinkedList <Integer> l1 = new LinkedList<Integer>();
                    getComponents(graph,i,l1,visited);
                    list.add(l1);
                }
            }
            Iterator itr = list.iterator();
        	while(itr.hasNext())
        	{
            	LinkedList <Integer> temp = (LinkedList <Integer>)itr.next();
            	boolean answer = findSwap(temp,p,q);
                if(answer ==  true)
                    continue;
                else
                    return "NO";
            }
            
            return "YES";
            
        }
    public static boolean findSwap(LinkedList<Integer> comp, int [] p, int [] q)
    {
        HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
        Iterator itr = comp.iterator();
        int t;
        while(itr.hasNext())
        {
            t = (Integer)itr.next();
            hm.put(p[t],0);
        }
        itr = comp.iterator();
        while(itr.hasNext())
        {
            t = (Integer)itr.next();
            if(hm.containsKey(q[t]))
                continue;
            else
                return false;
        }
        return true;
        
    }
        
        public static void getComponents(int [][]graph, int start, LinkedList<Integer> l1, boolean []visited)
        {
            int n =  visited.length;
            l1.add(start);
            visited[start]=true;
            for(int i =0;i<n;i++)
            {
                if(graph[start][i]==1 && visited[i] ==false)
                {
                    getComponents(graph,i,l1,visited);
                }
            }
        }

	

} 
