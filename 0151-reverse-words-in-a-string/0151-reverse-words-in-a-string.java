class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==' '){
                if(sb.length()>0){
                    sb.reverse();
                   ans+=sb;
                   ans+=" ";
                   sb=new StringBuilder();
                }
                
            }else{
               sb.append(ch);
            }
        }
        if(sb.length()>0){
                    sb.reverse();
                   ans+=sb;
                   
                   
                }
                return ans.trim();
    }
}