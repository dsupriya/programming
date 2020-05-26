
import java.util.*;
public class solution {
	
	int solve(String[] board , int n, int m)
	{
		// Write your code here.
        char [][] graph = new char[n][m];
        boolean [][] visited = new boolean[n][m];
        LinkedList <String> path = new LinkedList<String>();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                graph[i][j] =board[i].charAt(j);
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                char c = graph[i][j];
                path= new <String>LinkedList();
                String t = ""+i+j;
                path.add(t);
                boolean ans = findLoop(graph,visited,path,c);
                if(ans == true)
                    return 1;
            }
        }
        return 0;

	}
    public static boolean findLoop(char [][]graph, boolean [][]visited,LinkedList <String>path,char c)
    {
        int n = graph.length;
        int m = graph[0].length;
        String t = path.get(0);
        int row = t.charAt(0);
        //int i,j;
        boolean ans;
        int col = t.charAt(1);
        if(row<0 || col < 0 || row>=n || col >=m)
            return false;
        
        if(visited[row][col]==false && graph[row][col] ==c)
        {
            
            visited[row][col]=true;
        	int [] side = new int[8];
            side[0] = row+1;
        	side[1] =col;
            side[2] = row-1;
            side[3] = col;
            side[4] = row;
            side[5] = col+1;
            side[6] = row;
            side[7] = col-1;
            
            for(int i=0;i<8;)
            {
                /*if(side[i]<0 || side[i+1] < 0 || side[i]>=n || side[i+1] >=m)
            		continue;*/
            	String temp = ""+side[i]+side[i+1];
                path.add(temp);
                ans = findLoop(graph,visited,path,c);
                if(ans == true && path.size()>=4)
                    return true;
                
                else
                {
                    path.remove(temp);
                    //visited[side[i]][side[i+1]]=false;
                }
                i=i+2;
            }
            visited[row][col]=false;
            return false;
        	
        	
        }
        else
        {
            return false;
        }
        
        
    }
}
Connecting Dots
