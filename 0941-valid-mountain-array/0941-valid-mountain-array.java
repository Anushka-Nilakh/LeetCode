class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int a=0;
        int b=0;
        int j=0;
        
        while(j<arr.length-1){
            if(arr[j]<arr[j+1]){
                a++;
                j++;
            }else if(arr[j]>arr[j+1]){
                break;
            }else{
               return false;
            }
        }
        if(j==0 || j==arr.length-1){
            return false;
        }

        while( j<=arr.length-2){
            if(arr[j]>arr[j+1]){
                b++;
                j++;
            }else if(arr[j]<arr[j+1]){
                return false;
            }else{
                return false;
            }
        }
        if(a>0 && b>0 && j==arr.length-1){
            return true;
        }else{
            return false;
        }
    }
}