import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int edges = sc.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        int [][] graph = new int [n][n];
        while(edges>0)
        {
            edges--;
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph[s][e] =1;
            graph[e][s]=1;
            
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean [] visited = new boolean[n];
        //boolean ans = hasPath(graph,visited,start,end);
        boolean ans = hasPathBFS(graph,start,end);
        System.out.println(ans);
	}
    public static boolean hasPath(int [][]graph, boolean []visited, int start,int end)
    {
        int n = visited.length;
        if(visited[start]==false)
        {
            visited[start] = true;
            if(start == end)
            {
                visited[end] = true;
                return true;
            }
        }
        for(int i=0; i<n;i++)
        {
            if(graph[start][i]==1 && visited[i] ==false)
            {
                return hasPath(graph,visited,i,end);
            }
            
        }
        return false;
    }
    public static  boolean hasPathBFS(int [][] graph, int start, int end)
    {
        boolean answer =false;
        int n = graph[0].length;
        boolean [] visited = new boolean[n];
        LinkedList <Integer> list = new LinkedList<Integer>();
        list.add(start);
        visited[start]=true;
        //Iterator itr = l.iterator();
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            int t = list.remove(0);
            if(t == end )
            {
        		answer = true;
                break;
            }
            for(int i = 0;i<n;i++)
            {
                if(graph[t][i] ==1 && visited[i] == false)
                {
                    list.add(i);
                    visited[i]=true;
                }
            }
        }
        return answer;
        
	}
    }
