import java.util.*;

public class solution {

	// Return a string array that contains all the possible strings
    public static ArrayList<String> list = new ArrayList<String>();
	public static String[] keypad(int n){
		// Write your code here
        mykeypad(n);
        int t= list.size();
        String temp;
        String s = ""+n;
        String []an = new String[0];
        if(s.contains("1")||s.contains("0"))
        {
          return an;	   
        }
        String []ans =new String[t];
        int j=0;
        for(int i=0;i<t;i++)
        {
            ans[i]=list.get(i);
            
        }   
        	
        return ans;
        

	}
	public static void mykeypad(int n)
    {
        if(n==0)
        {
            list.add("");
            return;
        }
        else
        {
            mykeypad(n/10);
            int temp=0;
            String s="";
            temp=list.size();
            while(temp>0)
            {
                if(n%10==1)
                {
                    //list.add("");
                    return;
                }
                 if(n%10==0)
                {
                   // list.add("");
                    return;
                }
                if(n%10 ==2)
                {
                    s=list.get(0);
                    
                    list.add(s+"a");
                    list.add(s+"b");
                    list.add(s+"c");
                    list.remove(0);
                    temp--;
                    
                    
                }
                if(n%10 ==3)
                {
                    s=list.get(0);
                    
                    list.add(s+"d");
                    list.add(s+"e");
                    list.add(s+"f");
                    list.remove(0);
                    temp--;
                }
                if(n%10 ==4)
                {
                    s=list.get(0);
                    
                    list.add(s+"g");
                    list.add(s+"h");
                    list.add(s+"i");
                    list.remove(0);
                    temp--;
                }
                 if(n%10 ==5)
                {
                    s=list.get(0);
                    
                    list.add(s+"j");
                    list.add(s+"k");
                    list.add(s+"l");
                    list.remove(0);
                    temp--;
                }
                if(n%10 ==6)
                {
                    s=list.get(0);
                    
                    list.add(s+"m");
                    list.add(s+"n");
                    list.add(s+"o");
                    list.remove(0);
                    temp--;
                }
                if(n%10 ==7)
                {
                    s=list.get(0);
                	list.add(s+"p");
                    list.add(s+"q");
                    list.add(s+"r");
                    list.add(s+"s");
                    list.remove(0);
                    temp--;
                }
                 if(n%10 ==8)
                {
                    s=list.get(0);
                	list.add(s+"t");
                    list.add(s+"u");
                    list.add(s+"v");
                   
                    list.remove(0);
                    temp--;
                }
                if(n%10 ==9)
                {
                    s=list.get(0);
                	list.add(s+"w");
                    list.add(s+"x");
                    list.add(s+"y");
                   list.add(s+"z");
                    list.remove(0);
                    temp--;
                }
                
            }
        }
    }
}
