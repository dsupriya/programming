public class PalindromeSubstrings {

	public static int countPalindromeSubstrings(String s) {
		// Write your code here
        int count=0;
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
                count++;
                l--;
                r++;
            }
            //even length
            l=i;
            r=i+1;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r))
            {
                count++;
                l--;
                r++;
            }
            
        }
        return count;
        

	}
}
