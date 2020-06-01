import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            t--;
            ArrayList <ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
            int n = sc.nextInt();
            int e = sc.nextInt();
            for(int i = 0; i < n; i++)
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
            int ans = island(list,n);
            System.out.println(ans);
        }
    }
        public static int island(ArrayList <ArrayList<Integer>> list, int n)
        {
            boolean  visited[] = new boolean[n];
            int level[] = new int[n];
            LinkedList <Integer>q = new LinkedList<Integer>();
            q.add(0);
            visited[0] = true;
            while(q.isEmpty() ==false)
            {
                int t = q.remove(0);
                if(t == n-1)
                    return level[t];
                Iterator itr = list.get(t).iterator();
                while(itr.hasNext())
                {
                    
                    int i = (Integer) itr.next();
                    if( visited[i] == false)
                    {
                        visited[i] = true;
                        q.add(i);
                        level[i] = level[t]+1;
                    }
                }
            }
             return -1;
            
        }
       

	}

Monk and the Islands
