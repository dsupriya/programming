import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
       
        while(true)
        {
            
            int n = sc.nextInt();
            if(n== 0)
                break;
            int [][]graph = new int[n][n];
            int [][]trans = new int[n][n];
            int e = sc.nextInt();
            int t1,t2;
            while(e>0)
            {
                e--;
                t1 =  sc.nextInt();
                t2 =  sc.nextInt();
                t1= t1-1;
                t2= t2-1;
                graph[t1][t2] = 1;
                trans[t2][t1] = 1;
                
            }
           kasaRaju(graph,trans,n);
            System.out.println();
        }

	}
    public static void kasaRaju(int [][] graph, int [][] trans, int n)
    {
        boolean [] visited = new boolean[n];
        Stack <Integer> s = new Stack<Integer>();
        int count=0;
        LinkedList <LinkedList> list = new LinkedList<LinkedList>();
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                DFS(graph,visited,i,s,n);
                
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
                
               LinkedList <Integer> l1 = new LinkedList<Integer>();
                DFS_trans(trans,visited_t,temp,n,l1);
                list.add(l1);
            }
        }
     //System.out.println(list); 
      Iterator itr = list.iterator();
    	LinkedList <LinkedList> sol = new LinkedList<LinkedList>();
    
    
	  while(itr.hasNext())
      {
          LinkedList <Integer>l2 = (LinkedList<Integer>)itr.next();
          boolean answer = isBottom(l2,graph);
          if(answer == true)
              sol.add(l2);
      }
        printSol(sol);
        
    }
    public static void printSol(LinkedList <LinkedList> l3)
    {
        Iterator itr = l3.iterator();
        ArrayList <Integer> f = new ArrayList<Integer>();
        
        while(itr.hasNext())
        {
            LinkedList <Integer>l4 = (LinkedList<Integer>)itr.next();
            f.addAll(l4);
        }
        Collections.sort(f);
    	itr = f.iterator();
        while(itr.hasNext())
        {
            System.out.print((int)itr.next()+1+" ");
        }
        
        
    }
    public static boolean isBottom(LinkedList <Integer>l2,int [][]graph)
    {
         Iterator itr = l2.iterator();
        int start;
        int n = graph.length;
        while(itr.hasNext())
        {
            start = (Integer)itr.next();
            for(int i = 0;i<n;i++)
            {
                if(graph[start][i] ==1)
                {
                    if(l2.contains(i) == false)
                        return false;
                }
            }
        }
        return true;
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
    public static void DFS_trans(int [][] trans, boolean visited_t[],int start, int n,LinkedList<Integer>l1)
    { 
        visited_t[start] = true;
        l1.add(start);
    	for(int i= 0;i<n;i++)
        {
            if(trans[start][i]==1 && visited_t[i]==false)
             DFS_trans(trans,visited_t,i,n,l1);
        }
    }
    

} 
