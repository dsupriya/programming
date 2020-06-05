import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        
        int ans = longestPalindromeSubstrings(p);
        System.out.println("length of longestPalindromeSubstrings "+ans);
     }
    public static int longestPalindromeSubstrings(String s) {
		// Write your code here
        int max=0;
        int cur=0;
        int n=s.length();
        int l,r;
        l=r=0;
        for(int i=0;i<n;i++)
        {
            //odd length
            l=i;
            r=i;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r))
            {
                cur = r-l+1;
                if(max<cur)
                    max=cur;
                l--;
                r++;
            }
            //even length
           l=i;
            r=i+1;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r))
            {
                cur = r-l+1;
                if(max<cur)
                    max=cur;
                
                l--;
                r++;
            }
            
        }
        return max;
        

	}
}
