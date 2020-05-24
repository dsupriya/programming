import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int [][] graph = new int[v][v];
        for(int i=0;i<e;i++)
        {
            int f = sc.nextInt();
            int s = sc.nextInt();
            graph[f][s] = 1;
            graph[s][f] = 1;
        }
        boolean []visited = new boolean [v];
        for(int i=0;i<v;i++)
        	BFS(graph,visited,i);
        
		
	}
    public static void BFS(int [][]graph, boolean [] visited, int start)
    {
        LinkedList <Integer> l = new  LinkedList<Integer>();
        int n = visited.length;
        l.add(start);
        Iterator itr = l.iterator();
        while(itr.hasNext())
        {
            int t = l.remove(0);
            if(visited[t]==false)
            	System.out.print(t+" ");
            visited[t] = true;
            for(int i =0;i<n;i++)
            {
                if(graph[t][i]==1 && visited[i]==false)
                    l.add(i);
            }
        }
    }
}
