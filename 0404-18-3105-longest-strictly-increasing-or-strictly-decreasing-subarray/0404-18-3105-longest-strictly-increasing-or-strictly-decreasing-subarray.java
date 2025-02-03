class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans_i=1, ans_d=1,imax=1,dmax=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
            ans_i++;
            else
            {
                imax=(imax>=ans_i)? imax:ans_i;
                ans_i=1;
            }
            
        }
        imax=(imax>=ans_i)? imax:ans_i;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
            ans_d++;
            else
            {
              dmax=(dmax>=ans_d)? dmax:ans_d;
                ans_d=1;
            }
           
        }
        dmax=(dmax>=ans_d)? dmax:ans_d;

        return (dmax>=imax)?dmax:imax;
        

        
    }
}