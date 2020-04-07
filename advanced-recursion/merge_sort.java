public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
		myMergeSort(input,0,input.length-1);
	}
    public static void myMergeSort(int []a, int start,int end)
    {
        int mid;
        if(start<end)
        {
            mid=(start+end)/2;
            myMergeSort(a,start,mid);
            myMergeSort(a,mid+1,end);
            merge(a,start,end,mid);
        }
    }
    public static void merge(int []a, int start, int end,int mid)
    {
        int n1 = (mid-start)+1;
        int n2= (end-mid);
        int []q1= new int[n1];
        int []q2= new int [n2];
        //q1[n1] = Math.INTEGER_MAX;
        //q2[n2] = Math.INTEGER_MAX;
        int i,j,k;
        k=start;
        for(int x=0;x<n1&&k<=mid;x++)
        {
            q1[x]=a[k];
            k++;
        }
        for(int x=0;x<n2&&k<=end;x++)
        {
            q2[x]=a[k];
            k++;
        }
        
        i=j=0;
        k=start;
        while(i<n1 && j<n2 && k<=end)
        {
            if(q1[i]<q2[j])
            {
                a[k]=q1[i];
                k++;
                i++;
            }
             else
            {
                a[k]=q2[j];
                k++;
                j++;
            }
        }
        while(i<n1&&k<=end)
        {
          a[k]=q1[i];
                k++;
                i++;   
        }
        while(j<n2&& k<=end)
        {
           	a[k]=q2[j];
                k++;
                j++;
        }
        
    }
}
