class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

 if(hand.length%groupSize!=0){
            return false;
        }
        Arrays.sort(hand);
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<hand.length;i++) list.add(hand[i]);
        int a=list.get(0);
        int c=0;
        while(list.size()>0){
             if(c==groupSize){
                a=list.get(0);
                c=0;
            }
            if(list.contains(a)){
                list.remove(Integer.valueOf(a));
                c++;
            } 
            else return false;
            
            if(c!=groupSize) a+=1; 
        }
       return true;
    }
}