class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;
        for(int num:prices){
            min=Math.min(num,min);
            maxProfit=Math.max(maxProfit,num-min);
        }
        return maxProfit;
    }
}