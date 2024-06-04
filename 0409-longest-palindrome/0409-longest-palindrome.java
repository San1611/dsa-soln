class Solution {
    public int longestPalindrome(String s) {

        if(s.length()==0 || s.length()==1)
        return s.length();

        	
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            System.out.println (ch);

        int freq[]= new int [ch.length];
        int k=0,index=0;
        char c= ch[0];
        for(int i=0;i<ch.length;i++)
        {
            if(c==ch[i]){
                k++;
            }
            else{
                freq[index]=k;
                k=1;
                index++;
                c=ch[i];
            }

        }
         freq[index]=k;
        int max=0,oddmax=0;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]%2==0)
            {
                max+=freq[i];
            }
              else{
		      max+=freq[i]-1;
		   if (freq[i] > oddmax)
		  {
			oddmax = freq[i];
		  }
		  
		  }


        }
        if(oddmax>0)
        return max+1;
        else
        return max;

        
    }
}