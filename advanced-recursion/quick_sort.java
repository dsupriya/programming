
public class Solution {
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		myquickSort(input,0,input.length-1);
	}
    public static void myquickSort(int []a, int start, int end)
    {
        if(start<end)
        {
            int mid = partition(a,start,end);
            myquickSort(a,start,mid-1);
            myquickSort(a,mid+1,end);
        }
    }
	public static int partition (int []a, int start, int end)
    {
        int i,j,p;
        int temp;
        //
        p=a[end];
        i= start-1;
        for(j=start;j<=end-1;j++)
        {
            if(a[j]< p)
            {
                i++;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                
            }
        }
        i++;
        temp = a[i];
        a[i]=a[end];
        a[end] =temp;
        return i;
        
            
    }
}
