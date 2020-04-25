import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []input = new int[n];
       // int output[] = new int[n];
        for(int i=0;i<n;i++)
            input[i]= sc.nextInt();
        
        //longest increasing sub-sequence    
        int ans = LIS(input,n);
        System.out.println(ans);
         
     }
     public static int LIS(int []input,int n)
     {
         int output[] = new int[n];
         output[0]=1;
         int max=1;
         for(int i=1;i<n;i++)
        {
            output[i]=1;
            max=1;
            for(int j=i-1;j>=0;j--)
            {
                if(input[j]>=input[i])
                {
                    continue;
                }
                else
                {
                   max=output[j]+1;
                   if(max>output[i])
                        output[i]=max;
                }
            }
        }
        max=1;
        for(int i=0;i<n;i++)
        {
            if(max<output[i])
                max=output[i];
        }
        return max;
         
     }
}
