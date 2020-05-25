import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        int [][]graph = new int [n][n];
        while(e>0)
        {
            e--;
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            graph[t1][t2] =1;
            graph[t2][t1] =1;
        }
        boolean visited [] = new boolean[n];
        ArrayList path = new ArrayList();
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                getComponents(graph,path,visited,i);
            }
            printSol(path);
            path = new ArrayList();
        }
    }
    public static void printSol(ArrayList path)
    {
        Collections.sort(path);
        Iterator itr =  path.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
    }
        
    public static void getComponents(int [][]graph, ArrayList path, boolean visited[], int start)
        {
            int n = visited.length;
            ArrayList <Integer> q = new ArrayList<Integer>();
            visited[start] = true;
            q.add(start);
            while(q.isEmpty() == false)
            {
                int t = q.remove(0);
                path.add(t);
                
                //System.out.print(t+" ");
                for(int i=0;i<n;i++)
                {
                    if(graph[t][i]==1 && visited[i]==false)
                    {
                        q.add(i);
                        visited[i]=true;
                    }
                }
            }
        }
        
	
}
