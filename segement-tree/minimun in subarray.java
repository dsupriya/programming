import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int q= sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]= sc.nextInt();
        
        String c;
        int ans=0;
        int []tree= new int[4*n];
        buildTree(a,tree,1,0,n-1);
        /*for(int i=0;i<4*n;i++)
        {
            System.out.print(tree[i]+" ");
        }*/
        while(q>0)
        {
            q--;
            //sc.next();
            c = sc.next();
            if(c.charAt(0)=='q')
            {
                int left = sc.nextInt();
                int right = sc.nextInt();
                ans = query(tree,1,0,n-1,left-1,right-1);
                System.out.println(ans);
            }
            else
            {
                int index = sc.nextInt();
                int value = sc.nextInt();
               	updateTree(a,tree,1,0,n-1,index,value);
                
                
                
            }
        }

	}
    
    public static int query(int []tree, int node, int start, int end, int left, int right)
    {
        //out of range
        if(right< start || end < left)
            return Integer.MAX_VALUE;
        // completely in rane
        if(left<= start && end<= right)
            return tree[node];
        else
        {
            int mid = (start+end)/2;
            int ans1 = query(tree,node*2,start,mid,left,right);
            int ans2 =  query(tree,node*2+1,mid+1,end,left,right);
            return Math.min(ans1,ans2);
        }
        
        
    }
   
    public static void buildTree(int []a,int []tree, int node, int start, int end)
    {
        if(start==end)
        {
            tree[node] =a[start];
            return;
        }
        else
        {
            int mid = (start+end)/2;
            buildTree(a,tree,node*2,start,mid);
            buildTree(a,tree,node*2+1,mid+1,end);
            tree[node] =Math.min(tree[node*2],tree[node*2+1]);
            return;
            
        }
    }/*public static void updateTree(int []a, int []tree, int node, int start, int end,  int value, int index)
    {
        
        if(start==end)
        {
            a[index]=value;
            tree[node]=value;
            return;
        }
        int mid =(start+end)/2;
        if(mid>index)
        {
            updateTree(a,tree,node*2,start,mid-1,value,index);
            
        }
        else
        {
            updateTree(a,tree,node*2+1,mid+1,end,value,index);
        }
        tree[node] = tree[node*2]+tree[node*2+1];
        return;
        
        
    }*/
    public static void updateTree(int []a, int []tree, int node, int start, int end, int index, int value)
    {
        if(start == end)
        {
            a[index] =value;
            tree[node] = value;
            return;
        }
        else
        {
            int mid = (start+end)/2;
            if(mid>index)
            {
                updateTree(a,tree,node*2,start,mid,index,value);
            }
            else
            {
                updateTree(a,tree,node*2+1,mid+1,end,index,value);
            }
            tree[node] =Math.min(tree[node*2],tree[node*2+1]);
            return;
            
        }
    }

    
}
