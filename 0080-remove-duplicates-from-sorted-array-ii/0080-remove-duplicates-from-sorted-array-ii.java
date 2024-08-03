class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt=0,temp=nums[0];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==temp){
                cnt++;
            

            if(cnt<=2){
            list.add(nums[i]);
            }
            }

            if(temp!=nums[i])
            {
                temp=nums[i];
                cnt=1;
                list.add(nums[i]);
            }
            

        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }

       return list.size();
        
    }
}