public class Solution {
	public static int findString(String text, String pattern) {
		// Write your code here
        return KMPSearch(pattern,text);

	}
    
    
    public static int KMPSearch(String p, String t)
     {
         int []lps = LongestPrefixSuffix(p);
         //System.out.print(p+" "+t);
         int n = p.length();
         int m = t.length();
         int i,j;
         i=j=0;
         while(i< m && j<n)
         {
             if(t.charAt(i) == p.charAt(j))
             {
                 //System.out.println(t.charAt(i)+" "+p.charAt(j));
                 //System.out.println(i+" "+j);
                 
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
       // System.out.println(i+" "+j);

         if(j==n)
         {return i-n;}
        else 
            return -1;
         
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
        /*for(i=0;i<n;i++)
        {
            System.out.println(p.charAt(i)+" "+lps[i]);
        }*/
        return lps;
    }
}
