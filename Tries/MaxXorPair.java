/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class TriesNode
{
  TriesNode left;
  TriesNode right;
  TriesNode()
    {
        left=right=null;
    }
  
 
  
  

}
public class Main
{
  public static void main (String[]args)
  {
    
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int[] a = new int[n];
    TriesNode head = new TriesNode ();

    for (int i = 0; i < n; i++)
      {
	    a[i] = sc.nextInt ();
	    insertValue (a[i], head);
      }
    int ans = maxXORPair(head, a, n);
    System.out.println("Tries ans "+ans);
    ans = maxXORBruteForce(a,n);
    System.out.println("XORBruteForce "+ans);
    

  }
  public static void insertValue (int value, TriesNode head)
  {
    TriesNode cur = head;
    for(int i=31;i>=0;i--)
    {
        int bit = (value>>i)&1;
        if(bit == 0)
        {
            if(cur.left == null)
                cur.left = new TriesNode();
            cur = cur.left;
        }
         else
        {
            if(cur.right == null)
                cur.right = new TriesNode();
            cur = cur.right;
        }
    }
  }
  public static int maxXORBruteForce(int []a,int n)
  {
      int max, cur;
      max = Integer.MIN_VALUE;
      for(int i =0;i<n;i++)
    {
        for(int j = i;j<n;j++)
        {
            cur= a[i]^a[j];
            if(max<cur)
                max = cur;
        }
    }
    return max;
  }
  public static int maxXORPair (TriesNode head, int []a,int n)
  {
        TriesNode cur = head;
        int value,bit;
        int max,xor;
        max =  Integer.MIN_VALUE;
        xor = 0;
        for(int j=0;j<n;j++)
        {
            value=a[j];
            cur = head;
            xor = 0;
            for(int i=31;i>=0;i--)
            {
                bit = (value>>i)&1;
                if(bit == 0)
                {
                    if(cur.right != null)
                    {
                        xor = xor + (int)Math.pow(2,i);
                        cur =  cur.right;
                    }
                    else    
                        cur = cur.left;
                }
                else
                {
                    if(cur.left != null)
                    {
                        xor = xor + (int)Math.pow(2,i);
                        cur =  cur.left;  
                    }
                    else
                        cur = cur.right;
                    
                }
            }
            if(max<xor)
                max = xor;
            
            
        }
      return max;
  }
}
