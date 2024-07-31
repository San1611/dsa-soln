class Solution {
    public int minimumDeletions(String s) {
        int n= s.length();
        int aCount[]=new int[n];
        int bCount[]=new int[n];

        for(int i=1;i<n;i++){
            char c=s.charAt(i-1);
            bCount[i]=bCount[i-1];
            if(c=='b')
            bCount[i]++;
        }
         for(int i=n-2;i>=0;i--){
            char c=s.charAt(i+1);
            aCount[i]=aCount[i+1];
            if(c=='a')
            aCount[i]++;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,aCount[i]+bCount[i]);
        }
        return min;
        
    }
}