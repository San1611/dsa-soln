class Solution {
    public String removeOuterParentheses(String s) {
        String str="",finalstr="";
        int count1=0, count2=0;
        for(int i=0;i<s.length();i++)
        {
            str=str+s.charAt(i);
            if(s.charAt(i)=='(')
            count1++;
            if(s.charAt(i)==')')
            count2++;
            if(count1== count2)
            {
               finalstr+=str.substring(1,str.length()-1);
               str="";
            }

        }

        return finalstr;
        
    }
}