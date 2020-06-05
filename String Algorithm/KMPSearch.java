import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        String t = sc.next();
        //LongestPrefixSuffix function call
        //LongestPrefixSuffix(p); 
        boolean ans = KMPSearch(p,t);
        System.out.println(ans);
     }
     public static boolean KMPSearch(String p, String t)
     {
         int []lps = LongestPrefixSuffix(p);
         int n = p.length();
         int m = t.length();
         int i,j;
         i=j=0;
         while(i< m && j<n)
         {
             if(t.charAt(i) == p.charAt(j))
             {
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
         System.out.println(i+" "+j);
         System.out.println(t.length()+" "+p.length());
         if(j==n)
            return true;
        else 
            return false;
         
     }
     public static int[] LongestPrefixSuffix(String p)
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
        return lps;
    }
}
