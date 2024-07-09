class Solution {
    public double averageWaitingTime(int[][] customers) {
        double time=0, wait=0;
        for(int i=0;i<customers.length;i++){
            if(time<customers[i][0]){
                time=customers[i][0]+customers[i][1];
                wait+=customers[i][1];
            }
            else{
                time+=customers[i][1];
                wait+=time-customers[i][0];
            }
        }
        
        return wait/customers.length;
        
    }
}