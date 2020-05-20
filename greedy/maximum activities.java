import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ItemValue[] iVal = new ItemValue[n];
        int s, e;
        for(int i=0;i<n;i++)
        {
            s= sc.nextInt();
            e= sc.nextInt();
            iVal[i] = new ItemValue(s,e);
        }
        /*Arrays.sort(iVal, new Comparator<ItemValue>()  
        { 
            @Override
            public int compare(ItemValue o1, ItemValue o2)  
            { 
                return o2.cost.compareTo(o1.cost) ; 
            } 
        }); */
        
        //sorting the end time arrcoding to the end time
         Arrays.sort(iVal, new Comparator<ItemValue>()  
        { 
            @Override
            public int compare(ItemValue o1, ItemValue o2)  
            { 
                return  o1.end.compareTo(o2.end) ; 
            } 
        });
        int ans=1;
        int last=iVal[0].end;
        for(int i=1;i<n;i++)
        {
         	if(last<= iVal[i].start)
            {
                ans++;
                last = iVal[i].end;
            }
               
                
        }
        System.out.println(ans);
        

	}
    static class ItemValue  
    { 
        Integer end, start;
          
        // item value function 
        public ItemValue(int start, int end) 
        { 
            this.start = start;
            this.end = end;
        } 
    } 

}
