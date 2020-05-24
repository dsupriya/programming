import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [][] graph = new int[n][n];
        int edge = sc.nextInt();
        for(int i=0;i<edge;i++)
        {
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph[s][e] = 1;
            graph[e][s] = 1;
        }
        boolean visited[] = new boolean[n];
        DFS(graph,visited,1);
     }
     public static void DFS(int [][]graph, boolean []visited, int start)
    {
        int n = visited.length;
        if(visited[start] == false)
        {
            System.out.print(start+" ");
            visited[start] =true;
        }
        for(int i = 0;i<n;i++)
        {
            
            if(graph[start][i]==1 && visited[i]==false)
                DFS(graph,visited,i);
        }
    }
}
