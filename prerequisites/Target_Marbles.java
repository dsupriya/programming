import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a[]= new int[n];
        int start,end,sum,flag;
        
          start=end=sum=flag=0;
        
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            
        }
        while(end<n)
        {
            sum =sum+a[end];
            if(sum==t)
            {
                System.out.println("true");
                printArray(a,start,end);
                flag=1;
                break;
                  
            }
            if(sum>t)
            {
                start=start+1;
                end=start;
                sum=0;
            }
            else
            {
                end++;
            }
        }
        if(flag==0)
            System.out.println("false");
        

	}
    
public static void printArray(int []a, int start, int end)
{
  for(int i = start;i<=end;i++)
      System.out.print(a[i]+" ");
}
    



}