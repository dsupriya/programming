import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String p = sc.next();
        int n = t.length();
        int m = p.length();
        boolean ans = false;
        int k;
        
        for(int i =0;i<=n-m;i++)
        {
            ans = true;
            k=i;
            for(int j =0;j<m;j++)
            {
                System.out.println(t.charAt(k)+" "+ p.charAt(j));
                if(t.charAt(k) != p.charAt(j))
                {
                    ans = false;
                    break;
                }
                
                k++;
            }
            if(ans==true)
            {
                System.out.println(ans);
                return;
            }
        }
        System.out.println(ans);
        
     }
}
