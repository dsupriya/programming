class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] ans = new int [n];
        int neg,pos;
        neg=pos=Integer.MAX_VALUE;
        if(nums[0]>=0)
        {
            pos = 0;
            neg = -1;
        }
        else
        {
           for(int i=0;i<n;i++)
           {
               if(nums[i]>=0)
             {
                pos = i;
                neg = i-1;
                break;
            }
           }
           
        }
        if(neg==Integer.MAX_VALUE)
        {
            pos = n;
            neg = n-1;
        }
        for(int k=0 ; pos<n || neg>=0;k++)
        {
            if(neg<0)
            {
                ans[k] = nums[pos]*nums[pos];
                pos++;
                continue;
            }
            if(pos>=n)
            {
                ans[k] = nums[neg]*nums[neg];
                neg--;
                continue;
            }
            if((nums[neg]*nums[neg])<(nums[pos]*nums[pos]))
            {
                
                ans[k] = nums[neg]*nums[neg];
                //System.out.println(ans[k]+" "+k);
                neg--;
            }
            else
            {
                ans[k] = nums[pos]*nums[pos];
                pos++;
            }
        }
        return ans;
        
            
            
        
    }
}
