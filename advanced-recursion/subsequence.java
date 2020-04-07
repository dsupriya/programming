import java.util.*;

public class HelloWorld{
    public static ArrayList <String> list=new ArrayList <String>();

     public static void main(String []args){
        //System.out.println("Hello World");
        subsequence("abc");
        int temp= list.size();
        System.out.println(temp);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
        
     }
     public static void subsequence(String s)
     {
         //System.out.println(s);
         if(s.length()==0)
        {
            list.add(" ");
            return;
        }
        else
        {
            subsequence(s.substring(1));
            int temp= list.size();
            String t;
            for(int i=0;i<temp;i++)
            {
                t=""+s.charAt(0);
                //System.out.println(t);
                t=t+list.get(i);
                //System.out.println(t);
                list.add(t);
                
            }
           
            
        }
     }
}
