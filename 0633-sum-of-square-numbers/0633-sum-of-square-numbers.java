class Solution {
    public boolean judgeSquareSum(int c) {
       int sqr=(int)Math.sqrt(c);
       long left=0;
       long right=sqr;
       while(left<=right){
         if((long)(left*left+right*right)==(long)c){
            return true;
         }else if((long)(left*left+right*right)<(long)c){
            left++;
         }else{
            right--;
         }
       }
       return false;
    }
}