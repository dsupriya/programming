import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int a = sc.nextInt();
        	String str = sc.next();
            if(a==0)
            {
                System.out.print(str);
                return;
            }
            int b = reduceB(a,str);
            int ans=0;
            
            if(a>b)
             ans = advancedGCD(a,b);
            else
             ans = advancedGCD(b,a);
            System.out.println(ans);
            
        }
        
        

	}
    public static int advancedGCD(int a,int b)
    {
        if(b==0)
            return a;
        else
            if(b>a)
                return advancedGCD(b,a);
        	else
            	return advancedGCD(b,a%b);
        	
                
                
             
                
    }
    public static int reduceB(int a, String str)
    {
        int n = str.length();
        int no,r;
        //no=r=0;
        r=0;
        for(int i=0;i<n;i++)
        {
            String s =""+str.charAt(i);
            int t = Integer.parseInt(s);
            //System.out.println(t);
            r = ((r*10)+t)%a;
        }
        return r;
    }

}
