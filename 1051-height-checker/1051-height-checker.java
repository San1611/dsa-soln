class Solution {
    public int heightChecker(int[] heights) {
        int ar[]=new int[heights.length];
        int k=0;
        for(int i=0;i<heights.length;i++){
            ar[i]=heights[i];
        }
        Arrays.sort(ar);
        for(int i=0;i<heights.length;i++){
            if(ar[i]!=heights[i])
            k++;
        }

        return k;

        
    }
}