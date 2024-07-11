class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk= new Stack<>();
        String rev="", ans="";
        for(int i=0;i<s.length();i++){
            stk.push(s.charAt(i));
            if(stk.peek()==')')
            {
                stk.pop();
                while(!stk.isEmpty() && stk.peek()!='(')
                rev+=""+stk.pop();
            
            if(!stk.isEmpty())
            stk.pop();

            ans=rev;
            for(int j=0;j<ans.length();j++){
                stk.push(ans.charAt(j));
            }
            rev="";
            }
        }
        ans="";
        while(!stk.isEmpty()){
            ans=stk.pop()+""+ans;
            
        }
       
        return ans;

        
    }
}