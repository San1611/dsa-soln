class Solution {
    public boolean check(int[] nums) {
        int len=nums.length;
        int n=0;
        boolean output=true;
        for(int i=1;i<len;i++)
        {
            if(nums[i-1]>nums[i])
            n++;

        }
    if(n==1)
        {
        if(nums[len-1]<=nums[0])
            output= true;
            else
            output=false;
        }
    else if(n==0)
    output= true;
        else
    output= false;
        
        return output;
    }
}