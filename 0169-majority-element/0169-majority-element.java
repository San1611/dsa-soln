class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> map= new HashMap<>();
      int k=0,nm=nums[0],max=0;

      for(int i=0;i<nums.length;i++){

        if(!map.containsKey(nums[i])){

        for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j])
            k++;
        }
        
        map.put(nums[i],k);
        k=0;
        }

        if(map.get(nums[i])>max)
        {
        nm=nums[i];
        max=map.get(nums[i]);
        }
      }
    

        return nm;
        
    }
}