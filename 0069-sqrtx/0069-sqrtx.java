class Solution {
    public int mySqrt(int x) {
        int min=1;
        if(x==0) return 0;
        if(x==1 || x==2 || x==3) return 1;
        for(int i=1;i<=x/2;i++){
           long mult=(long)i*i;
           if(mult==x) {
            return i;
           }
           else if(mult<x) {
            min=Math.max(min,i);
            if(i==x/2) return min;
           }
           else{
             return min;
           }
        }
        return 0;
    }
}