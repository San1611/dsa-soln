class Solution {
    public int findCenter(int[][] edges) {
        int len=edges[0].length;
        int temp1=edges[0][0],temp2=edges[0][1];
        for(int i=1;i<len;i++){
            for(int j=0;j<2;j++){
                
                if(edges[i][j]==temp1)
                return temp1;
                else if(edges[i][j]==temp2)
                return temp2;

            }
        }

        return 0;
        
    }
}