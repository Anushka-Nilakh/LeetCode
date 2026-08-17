class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count=0;
        while(s.charAt(i)==' '){
            i--;
        }
        for(int j=i;j>=0;j--){
            if(s.charAt(j)!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}