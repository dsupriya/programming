import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] =new int[n+1];
        iterativeFibi(n);
        recursiveFibi(n,a);
        System.out.println("\nrecursive output "+a[n-1]);
     }
     public static void iterativeFibi( int n)
     {
         int [] a =new int[n+1];
         a[0]=0;
         a[1]=1;
         for(int i=2;i<n+1;i++)
            {
                a[i] =a[i-1]+a[i-2];
                System.out.print(a[i]+" ");
            }
        //System.out.println(a[n]);
     }
     public  static int  recursiveFibi(int n, int []a)
    {
        if(n==0||n==1)
            return 1;
        if(a[n]!=0)
        {
            //System.out.println(a[n]);
            return a[n];
        }
        int ans = recursiveFibi(n-1,a)+recursiveFibi(n-2,a);
        a[n]=ans;
        return ans;
        
    }
}
