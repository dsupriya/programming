import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int tree[] = new int[2*n];
        sumTree(a,tree,1,0,n-1);
        updateTree(a,tree,1,0,n-1,10,2);
       for(int i=0;i<2*n;i++)
        System.out.print(tree[i]+" ");
    }
    
    public static void fillArray(int [] a)
    {
        int n = a.length;
        for(int i=0;i<n;i++)
            a[i]= -1*i;
        return;
    }
    public static void sumTree(int []a,int []tree, int node, int start, int end)
    {
        if(start==end)
        {
            tree[node] =  a[start];
            System.out.println(a[start]  + " "+node);
            return;
        }
        int mid= (start+end)/2;
        sumTree(a,tree,node*2,start,mid);
        sumTree(a,tree,node*2+1,mid+1,end);
        tree[node] = tree[node*2]+tree[node*2+1];
        return;
        
        
    }
    
    public static void updateTree(int []a, int []tree, int node, int start, int end,  int value, int index)
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
        
        
    }
}
