import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        //LongestPrefixSuffix function call
        LongestPrefixSuffix(p);   
     }
     public static void LongestPrefixSuffix(String p)
    {
        int n = p.length();
        int []lps = new int[n];
        int i,j;
        i=1;
        j=0;
        
        while(i<n)
        {
            if(p.charAt(i)==p.charAt(j))
            {
                lps[i] = j+1;
                i++;
                j++;
            }
            else
            {
                if(j!=0)
                {
                    j = lps[j-1];
                }
                else
                    i++;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(p.charAt(i)+" "+lps[i]);
        }
    }
}
