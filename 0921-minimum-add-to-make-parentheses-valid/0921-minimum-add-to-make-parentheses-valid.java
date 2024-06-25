class Solution {
    public int minAddToMakeValid(String p) {
          int bal = 0; 
        int ans = 0; 
       
        for (int i = 0; i < p.length(); ++i) { 
       
            bal += p.charAt(i) == '(' ? 1 : -1; 
       
            if (bal == -1) { 
                ans += 1; 
                bal += 1; 
            } 
        } 
       
        return bal + ans;
        
    }
}