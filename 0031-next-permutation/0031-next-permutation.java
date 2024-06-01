class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums.length==1)
        nums[0]=nums[0];
        int index1=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1]){
            index1=i;
            break;
            }            
        }
        if(index1<0)
        Arrays.sort(nums,0, nums.length);
        else
        {
            int index2=-1;
            for(int i=nums.length-1;i>=0;i--)
            {
                if(nums[i]>nums[index1]){
                    index2=i;
                    break;
                }
            }
            //swap(nums[index1],nums[index2]);
           int temp=nums[index1];
           nums[index1]=nums[index2];
           nums[index2]=temp;
           Arrays.sort(nums,index1+1,nums.length);
        }
        
        }
       

        
    }
