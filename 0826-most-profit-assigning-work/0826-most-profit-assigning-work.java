class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Arrays.sort(worker);

        int index=0, output=0,max=0;
        for(int i=0;i<worker.length;i++){
            for(int j=0;j<difficulty.length;j++){
                if(difficulty[j]<=worker[i])
                {
                    max=Math.max(max,profit[j]);
                }

            }
            output+=max;
            



        }

       return output; 
    }
}