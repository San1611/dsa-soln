class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int max=0, sum=0,gs=0,start=0,end=0;
        for(end=0;end<customers.length;end++){
            if(grumpy[end]!=1)
            {
                sum+=customers[end];
            }
            else{
                while(end-start+1> minutes){
                    if(grumpy[start]==1)
                    gs-=customers[start];
                    start++;
                    
                }
                gs+=customers[end];
                max=Math.max(gs,max);
            }
        }

        return sum+max;
        
    }
}