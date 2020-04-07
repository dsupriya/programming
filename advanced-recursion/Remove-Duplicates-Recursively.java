public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        String temp;
        
        String ans;
        if(s.length() ==1)
        {
            return s;
        }
        else
        {
            if(s.charAt(0)==s.charAt(1))
                temp="";
            else
                temp=""+s.charAt(0);
        }
        ans= removeConsecutiveDuplicates(s.substring(1));
        return (temp+ans);
        

	}

}
