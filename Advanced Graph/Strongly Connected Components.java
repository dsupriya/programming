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
            int [][]graph = new int[n][n];
            int [][]trans = new int[n][n];
            int e = sc.nextInt();
            int t1,t2;
            while(e>0)
            {
                e--;
                t1 =  sc.nextInt();
                t2 =  sc.nextInt();
                //t1= t1-1;
                //t2= t2-1;
                graph[t1][t2] = 1;
                trans[t2][t1] = 1;
                
            }
            int ans = kasaRaju(graph,trans,n);
            //System.out.println(ans);
        }

	}
    public static int kasaRaju(int [][] graph, int [][] trans, int n)
    {
        boolean [] visited = new boolean[n];
        Stack <Integer> s = new Stack<Integer>();
        int count=0;
        /*for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(graph[i][j]+" ");
            System.out.println();
        }
        System.out.println("-----------------------");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(trans[i][j]);
            System.out.println();
            
        }*/
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                DFS(graph,visited,i,s,n);
                //System.out.println("start DFS"+i);
            }
        }
        boolean []visited_t = new boolean[n];
        //Iterator itr = s.iterator();
        //System.out.println(s);
        int temp;
        while(s.empty() == false)
        {
            temp = s.pop();
            //System.out.println(temp);
            if(visited_t[temp] == false)
            {
               
                DFS_trans(trans,visited_t,temp,n);
                System.out.println();
            }
        }
     return count;   
    }
     public static void DFS(int [][]graph, boolean [] visited, int start, Stack <Integer>s, int n)
     {
         visited[start] = true;
         //System.out.println("Starttinh the DFS for "+start);
         
         for(int i=0;i<n;i++)
         {
             if(graph[start][i] == 1 && visited[i] ==false)
             {
                 DFS(graph,visited,i,s,n);
             }
         }
         //System.out.println("pushing element "+start);
         s.push(start);
         return;
         
     }
    public static void DFS_trans(int [][] trans, boolean visited_t[],int start, int n)
    { System.out.print(start+" ");
        visited_t[start] = true;
    	for(int i= 0;i<n;i++)
        {
            if(trans[start][i]==1 && visited_t[i]==false)
             DFS_trans(trans,visited_t,i,n);
        }
    }
    

}
