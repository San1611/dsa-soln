class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        if(sentence.equals("")) return "";
        String s[]=sentence.split(" ");
        for(int i=0;i<s.length;i++){
            int index=0;
            while(index<dictionary.size()){
                String n=dictionary.get(index);
                String k=s[i];
                if(k.startsWith(n)){
                    s[i]=n;

                } 
                index++;
            }
        }
        String k="";
        for(int i=0;i<s.length;i++) k=k+s[i]+" ";
        return k.trim();
        
    }
}