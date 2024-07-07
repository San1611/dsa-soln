class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles<numExchange)
        return numBottles;

        int max=numBottles,exchange=0;
        while(numBottles>=numExchange){
            numBottles-=numExchange-1;
            exchange++;
            
        }
        

        return max+exchange;        

        
    }
}