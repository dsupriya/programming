import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        ArrayList <Integer> path = new ArrayList<Integer>();
        boolean [] visited = new boolean[v];
        int [][]graph = new int[v][v];
        while(e>0)
        {
            e--;
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            graph[t1][t2] = 1;
            graph[t2][t1] = 1;
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        visited[start] =true;
        Object ob = getPath(graph,visited,path,start,end);
        if(path.size()>0)
            path.add(start);
        Iterator itr = path.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        
	}
    public static Object getPath(int [][]graph, boolean []visited, ArrayList path, int start, int end)
    {
        int n = visited.length;
        if(start == end)
        {
            ArrayList <Integer> temp = new ArrayList<Integer>();
            return temp.add(end);
        }
        for(int i =0;i<n;i++)
        {
            if(graph[start][i] == 1 && visited[i] ==false)
            {
                visited[i]=true;
                Object ans = getPath(graph,visited,path,i,end);
                if(ans != null)
                {
                   
                    path.add(i);
                    return path;
                }
                
            }
        }
        
         return null;
    }
}
