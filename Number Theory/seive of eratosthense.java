import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean []visited = new boolean[n+1];
        for(int i=0;i<=n;i++)
            visited[i] =  true;
        
        int root = (int)Math.ceil(Math.sqrt(n));
        visited[0] = false;
        visited[1] =  false;
        System.out.println(root);
        
        for(int i=2;i<=root;i++)
        {
            updateMultiple(i,visited);
        }
        
        for(int i=0;i<=n;i++)
        {
            if( visited[i] ==  true)
                System.out.print(i+" ");
        }
           
      
    }
    public static void updateMultiple(int j,boolean []visited)
    {
        int n = visited.length;
        for(int i=j*j;i<n;i=i+j)
        {
            System.out.println("Multiple of "+j+" "+ i);
            visited[i] = false;
        }
            
        
    }
    
    
  
}
