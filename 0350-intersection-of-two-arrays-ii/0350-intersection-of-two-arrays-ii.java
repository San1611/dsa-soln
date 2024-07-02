class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
      
        for(int i=0;i<nums1.length;i++){
           list.add(nums1[i]);
            
        }
  
        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i]) ) {
                list2.add(nums2[i]);
                list.remove(Integer.valueOf(nums2[i]));  
                //System.out.println(list);     

            }

           
        }
      
        int arr[]= new int[list2.size()];
        for(int i=0;i<list2.size();i++){
            arr[i]=list2.get(i);
        }

        return arr;

        
    }
}