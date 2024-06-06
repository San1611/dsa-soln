class Solution {
    public int subarraySum(int[] nums, int k) {
       

        HashMap<Integer,Integer> map= new HashMap<>();
        int sum=0,freq=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
          if(map.containsKey(sum-k))
            {
                freq+=map.get(sum-k);
            }
            
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        if(nums.length==1 && nums[0]==k)
        freq=1;
        else if(nums.length==1 && nums[0]!=k)
        freq=0;

        return freq;
        
    }
}