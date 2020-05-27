
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
                String t = ""+(char)(i)+(char)(j);
                path.add(t);
                visited[i][j] =true;
                boolean ans = findLoop(graph,visited,path,c);
                
                if(ans == true)
                    return 1;
            }
        }
        //System.out.println();
        return 0;

	}
    public static boolean isStart(int i, int j, String start)
    {
        int row = start.charAt(0);
        int col = start.charAt(1);
        
        //left
        if(i==row && j-1 == col)
            return true;
        //right
        if(i == row && j+1 == col)
			return true;
        //up
        if(i-1==row && j== col)
            return true;
        //down
        if(i+1==row && j==col)
            return true;
        
        return false;
        
            
    }
    public static boolean findLoop(char [][]graph, boolean [][]visited,LinkedList <String>path,char c)
    {
        int n = graph.length;
        int m = graph[0].length;
        int list_size = path.size();
        boolean ans;
        String t = path.getLast();
        int row = t.charAt(0);
    	int col = t.charAt(1);
        String start = path.get(0);
        if(list_size>=4 && isStart(row,col,start)== true)
            return true;
        //System.out.print(row+" "+col+" "+c);
        int [] side = new int[8];
        side[0] = row+1;
        side[1] =col;
        side[2] = row-1;
        side[3] = col;
        side[4] = row;
        side[5] = col+1;
        side[6] = row;
        side[7] = col-1;
            
            for(int i=0;i<8;i=i+2)
            {
                if(side[i]<0 || side[i+1] < 0 || side[i]>=n || side[i+1] >=m)
            		continue;
                int cur_row = side[i];
                int cur_col = side[i+1];
            	
                if(visited[cur_row][cur_col] == false && graph[cur_row][cur_col] == c)
                {
                    visited[cur_row][cur_col]=true;
                    String temp = ""+(char)(cur_row)+(char)(cur_col);
                	path.add(temp);
                	ans = findLoop(graph,visited,path,c);
                	if(ans == true )
                    	return true;
                
                	else
                	{
                    	path.remove(temp);
                    	visited[cur_row][cur_col]=false;
                	}
                
            	}
            }
            
            return false;
    }
}
