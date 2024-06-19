class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long k=n;

        if(k<0){
            k=-k;
            x=1/x;
        }
        while(k>0){
            if(k%2==0){
                x=x*x;
                k=k/2;
            }
            else{
                ans*=x;
                k--;
            }
        }


        return ans;
        
    }
}