class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*(long)k>(long)bloomDay.length)
        return -1;

        int max=0,min=bloomDay[0];
       for(int i=0;i<bloomDay.length;i++){
        max=Math.max(max,bloomDay[i]);
        min=Math.min(min,bloomDay[i]);
       }
       
       int high=max, low=min;
       int middle=0;
       while(low<=high){
         middle=(high+low)/2;
         if(possible(bloomDay,middle,m,k))
         {
            high=middle-1;
            
         }
         else{
            low=middle+1;

         }        

       }
       return low;
        
    }
    public boolean possible(int arr[], int day, int m, int k){
        int countr=0, bq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day)
            countr++;
            else{
                bq+=countr/k;
                countr=0;
            }
        }
        bq+=countr/k;

        return bq>=m;

    }
}