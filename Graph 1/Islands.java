import java.util.*;
public class solution {
    
    public int solve(int n,int m,int u[],int v[]) {
        //write your code here
        int [][] graph = new int[n][n];
        boolean [] visited = new boolean[n];
        for(int i=0;i<m;i++)
        {
            int t1 = u[i]-1;
            int t2 = v[i]-1;
            graph[t1][t2] =1;
            graph[t2][t1]=1;
    	}
        int ans =0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                getComponent(graph,visited,i);
                ans++;
            }
        }
        return ans;
    }
    public static void getComponent(int [][]graph, boolean []visited, int start)
    {
        int n = visited.length;
        ArrayList <Integer>q = new ArrayList<Integer>();
        q.add(start);
        visited[start]=true;
        while(q.isEmpty()==false)
        {
            int t = q.remove(0);
            for(int i =0;i<n;i++)
            {
                if(graph[t][i] == 1 && visited[i] ==false)
                {
                    visited[i]=true;
                    q.add(i);
                }
            }
            
        }
    }
}
