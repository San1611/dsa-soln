class Solution {
    public int maxSubArray(int[] nums) {
       int max=nums[0],finalmax=nums[0];
       for(int i=1;i<nums.length;i++)
       {
        max=Math.max(nums[i],max+nums[i]);
        if(max>finalmax)
        finalmax=max;
       }

       return finalmax;
        
    }
}