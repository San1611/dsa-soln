class Solution {
    
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int ar[][]= new int [rowSum.length][colSum.length];

        for(int i=0; i<rowSum.length;i++){
            for(int j=0;j<colSum.length;j++){
                ar[i][j]=Math.min(rowSum[i],colSum[j]);
                colSum[j]-=ar[i][j];
                rowSum[i]-=ar[i][j];
            }
        }

        return ar;

        
    }
}