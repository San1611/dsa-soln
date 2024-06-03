class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        Arrays.sort(nums);
        int max=0, k=1;
        int index=nums[0];
        for(int i=0;i<nums.length;i++){      
            if(index+1==nums[i])
            {
                k++;
                index=nums[i];
            } 
            else if(index==nums[i])
            {
               index=nums[i];

            } 
            else{
                k=1;
                index=nums[i];
            } 
            if(k>max)
            max=k;            
            

        }
         if(k>max)
            max=k; 
        

        return max;

        
    }
}