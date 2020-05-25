import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
        int graph [][] = new int [v][v];
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
        //ArrayList <Integer> path = new Arraylist<Integer>();
        
        getPathBFS(graph,start,end);
		
	}
    public static void getPathBFS(int [][]graph,  int start, int end)
    {
        int n = graph[0].length;
        ArrayList <Integer> q = new ArrayList<Integer>();
        HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
        boolean [] visited = new boolean[n];
        q.add(start);
        visited[start]=true;
        boolean flg =false;
        while(q.isEmpty() == false)
        {
            int t = q.remove(0);
            if(t==end)
            {
                flg = true;
                break;
            } 
            for(int i=0;i<n;i++)
            {
                if(graph[t][i]==1 && visited[i] == false)
                {
                    q.add(i);
                    visited[i]=true;
                    hm.put(i,t);
                }
            }
        }
        if(flg == true)
        {
            int temp=end;
            while(temp!=start)
            {
                
                System.out.print(temp+" ");
                temp = hm.get(temp);
            }
            System.out.print(start+" ");
            
        }
        
        
    }
}
