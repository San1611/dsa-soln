class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        boolean result=false;
        char sa[]=s.toCharArray();
        char ta[]=t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        for(int i=0;i<sa.length;i++){
            if(sa[i]!=ta[i])
            {
                result=false;
                break;
            }
            else{
                result=true;
            }
            
        }

        return result;
    }
}