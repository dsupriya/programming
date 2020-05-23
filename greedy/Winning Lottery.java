import java.util.*;
import java.util.stream.*;

public class Main {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        Scanner sc = new Scanner(System.in);
        int s= sc.nextInt();
        int d = sc.nextInt();
        /*int[] a = {10,20,30,40,50};
int sum = IntStream.of(a).sum();
System.out.println("The sum is " + sum);*/
        int n =s-1;
        int []ans =new int[d];
        ans[0]=1;
        for(int i=d-1;i>0;i--)
        {
            if(IntStream.of(ans).sum()+9<=s)
                ans[i]=9;
            else
                ans[i]=s-IntStream.of(ans).sum();
            if(IntStream.of(ans).sum()==s)
                break;
        }
    
        if(1 <IntStream.of(ans).sum()-s && IntStream.of(ans).sum()-s <=9)
            ans[0] = IntStream.of(ans).sum()-s ;
        
        for(int i=0;i<d;i++)
        	System.out.print(ans[i]);
        System.out.println();

	}

}
