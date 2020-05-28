public class solution {
    public int solve(int n,int m,int u[],int v[]) {
        //write your code here
        int [][] graph = new int[n][n];
        for(int i=0;i<m;i++)
        {
            
            int row = u[i]-1;
            int col = v[i]-1;
            graph[row][col]=1;
            graph[col][row]=1;
        }
        int count=0;
    	for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(graph[i][j]==1)
                {
                    for(int k=0;k<n;k++)
                	{
                    	if(graph[j][k]==1&&graph[k][i]==1)
                            count++;
                	}
                }
                
            }
        }
        //System.out.println(count);
        return count/6;
        
    }
}
