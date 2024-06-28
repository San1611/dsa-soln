class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long arr[]= new long [n];
        for(int i=0;i<roads.length;i++){
            arr[roads[i][0]]++;
            arr[roads[i][1]]++;

        }
        Arrays.sort(arr);
        long res=0;
        long label=1;
        for(int i=0;i<n;i++){
            res+=(arr[i]*label);
            label++;
        }

        return res;
        
    }
}