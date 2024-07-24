class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int arr[][]= new int[nums.length][2];
        int d=0,n=0,num=0;
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=Integer.toString(nums[i]).length();
        }
        for(int i=0;i<nums.length;i++){
            d=arr[i][1];
            num=arr[i][0];
            arr[i][1]=0;

            while(d>0){
                 d--;
                n=num/(int)(Math.pow(10,d));
                arr[i][1]=arr[i][1]*10+mapping[n];                
                num=num%(int)(Math.pow(10,d));
               

            }

        }
         
        Arrays.sort(arr, (a,b)->Integer.compare(a[1],b[1]));

        int res[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            res[i]=arr[i][0];
        }

        return res;

        
    }
}