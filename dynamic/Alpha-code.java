import java.util.Scanner;
import java.lang.*;
public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner (System.in);
        while(sc.hasNext())
        {
            String s = sc.next();
            if(s.equals("0"))
            {
                return;
            }
            //int input = new int[s.length()];
            int []output = new int[s.length()+1];
            int ans = num_code(s,output);
            System.out.println(ans);
        }
        

	}
    public static int num_code(String s, int [] output)
    {
        String temp;
        temp=""+s.charAt(0);
        int d= 10000007;
        if(Integer.parseInt(temp)!=0)
        {
            output[0]=1;
        }
        
        if(s.length()>1)
        {temp=""+s.charAt(1);
        if(Integer.parseInt(temp)!=0)
        {
            output[1]=1;
        }}
        int t;
        String temp1;
        for(int i=2;i<output.length;i++)
        {
            if(s.charAt(i-1)!='0')
            	output[i]=output[i-1];
            
                
            temp=""+s.charAt(i-1);
            temp1=""+s.charAt(i-2);
            t = Integer.parseInt(temp1)*10 + Integer.parseInt(temp);
            if(t<=26 && t>=10)
                
            {
               // System.out.println("t :"+t);
                output[i]=((output[i])+(output[i-2]));
            }
            
        }
        return output[s.length()];
        
    }

}
