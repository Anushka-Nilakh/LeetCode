class Solution {
    public void duplicateZeros(int[] arr) {
        int possiblezero=0;
        int lastIdx=arr.length-1;
        for(int i=0;i<=lastIdx-possiblezero;i++){
            if(arr[i]==0){
                if(i==lastIdx-possiblezero){
                    arr[lastIdx]=0;
                    lastIdx-=1;
                    break;
                }
                possiblezero++;
            }
        }

        int newLastIdx=lastIdx-possiblezero;
        for(int i=newLastIdx;i>=0;i--){
            if(arr[i]==0){
                arr[i+possiblezero]=0;
                possiblezero--;
                arr[i+possiblezero]=0;
            }else{
                arr[i+possiblezero]=arr[i];
            }
        }
    }
}