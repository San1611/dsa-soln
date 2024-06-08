class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        String reverse="",str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && str!="")
            {
                reverse=str+" "+reverse;
                str="";
            }
            else if(s.charAt(i)!=' ')
            str+=s.charAt(i);
        }

        return reverse.trim();
        
    }
}