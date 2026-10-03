class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;
        int j=0;
        int idx=0;
        while(j<=n-1){
            if(nums[j]==val){
                j++;
            }else{
                nums[i]=nums[j];
                i++;
                j++;
                idx++;
            }
        }
        return idx;
    }
}