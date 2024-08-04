class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int newArr[][]= new int[n*(n+1)/2][2];
        int sum=0,idx=0;
       for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            sum+=nums[j];
            newArr[idx][0]=idx;
            newArr[idx][1]=sum;
            idx++;
        }
        sum=0;
       }
       Arrays.sort(newArr, (a,b)->Integer.compare(a[1],b[1]));
        sum=0;
       for(int i=left-1;i<right;i++){
        sum=(sum+newArr[i][1])%((int)(Math.pow(10,9)) + 7);
       }

       return sum;
        
    }
}