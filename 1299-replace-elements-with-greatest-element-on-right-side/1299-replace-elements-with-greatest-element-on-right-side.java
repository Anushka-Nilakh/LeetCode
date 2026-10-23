class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length==1){
            arr[0]=-1;
            return arr;
        }
        int temp=arr[arr.length-1];
        arr[arr.length-1]=-1;
        
        for(int i=arr.length-2;i>=0;i--){
           int curr=arr[i];
           arr[i]=temp;
           temp=Math.max(temp,curr);
        }
        return arr;
    }
}