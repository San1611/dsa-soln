class Solution {
    public int minDifference(int[] nums) {
        
        if(nums.length>4){
            Arrays.sort(nums);
            int min=nums[nums.length-4]-nums[0];
            min=Math.min(min, nums[nums.length-3]-nums[1]);
            min=Math.min(min, nums[nums.length-2]-nums[2]);
            min=Math.min(min, nums[nums.length-1]-nums[3]);           


            return min;
        }
        
        return 0;


        
    }
}