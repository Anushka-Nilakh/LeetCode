class Solution {
    public int checkValue(char ch){
        if(ch=='I') return 1;
        if(ch=='V') return 5;
        if(ch=='X') return 10;
        if(ch=='L') return 50;
        if(ch=='C') return 100;
        if(ch=='D') return 500;
        if(ch=='M') return 1000;
        return 0;
    }
    public int romanToInt(String s) {
        int ans=0;
        if(s.length()==1){
            return checkValue(s.charAt(0));
        }
        if(s.length()==2){
           if(checkValue(s.charAt(0))<checkValue(s.charAt(1))){
             ans-=checkValue(s.charAt(0));
             ans+=checkValue(s.charAt(1));
           }else if(checkValue(s.charAt(0))>=checkValue(s.charAt(1))){
            ans+=checkValue(s.charAt(0));
            ans+=checkValue(s.charAt(1));
           }
           return ans;
        }
        
        for(int i=1;i<s.length();i++){
            
            if(checkValue(s.charAt(i-1))<checkValue(s.charAt(i))){
                ans-=checkValue(s.charAt(i-1));
            }else{
                ans+=checkValue(s.charAt(i-1));
            }

            
        }
        ans+=checkValue(s.charAt(s.length()-1));
        
        return ans;
    }
}