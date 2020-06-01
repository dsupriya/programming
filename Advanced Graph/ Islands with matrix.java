import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int n = sc.nextInt();
            int [][] graph = new int[n][n];
            //ArrayList <ArrayList<Integer>> g = new  ArrayList <ArrayList<Integer>>();
            int e = sc.nextInt();
            while(e>0)
            {
                e--;
                int t1 = sc.nextInt();
                int t2 = sc.nextInt();
                t1--;
                t2--;
                graph[t1][t2] =1;
                graph[t2][t1] =1;
            }
            int ans = island(graph,n);
            System.out.println(ans);
        }
    }
        public static int island(int [][] graph, int n)
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
                for(int i =0;i<n;i++)
                {
                    if(graph[t][i] == 1 && visited[i] == false)
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

