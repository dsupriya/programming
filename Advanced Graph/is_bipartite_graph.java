import java.util.*;
public class HelloWorld{

     public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int e = sc.nextInt();
       int [][] graph = new int[n][n];
       while(e>0)
        {
            e--;
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            graph[t1][t2] = 1;
            graph[t2][t1] = 1;
            
        }
        boolean ans = isBiPartiate(graph,n);
        System.out.println(ans);
        
    }
    public static boolean isBiPartiate(int [][] graph, int n)
    {
        boolean []visited = new boolean[n];
        Set <Integer>s1 = new HashSet<Integer>();
        Set <Integer>s2 = new HashSet<Integer>();
        LinkedList <Integer> q = new <Integer>LinkedList();
        s1.add(0);
        q.add(0);
        int t, cur_set, o_set,neighbour;
        while(q.isEmpty() == false)
        {
            t=q.remove(0);
            if(s1.contains(t) == true)
            {
                cur_set=1;
                o_set=2;
                
            }
            else
            {
                cur_set=2;
                o_set=1;   
            }
            for(int i=0;i<n;i++)
            {
                if(graph[t][i]==1)
                {
                    if(s1.contains(i)==false && s2.contains(i) == false )
                    {
                        if(o_set==2)
                            s2.add(i);
                        else
                            s1.add(i);
                        q.add(i);
                    }
                    else if(cur_set == 2)
                    {
                        if(s2.contains(i) ==true)
                            return false;
                        
                    }
                    else if(cur_set == 1)
                    {
                        if(s1.contains(i) ==true)
                            return false;
                    }
                    
                }
            }
        }
    return true;
    }
}
