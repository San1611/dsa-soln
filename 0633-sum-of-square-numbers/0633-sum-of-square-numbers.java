class Solution {
    public boolean judgeSquareSum(int c) {
        HashMap<Integer,Integer> map= new HashMap<>();
        boolean result=false;
        for(int i=0;i<=Math.sqrt(c);i++){
            if(!map.containsKey(i*i))
            {
                map.put(i*i,i);
            }
            if(map.containsKey(c- (i*i)))
            {
                result=true;
                break;
            }

        }

        return result;
        
    }
}