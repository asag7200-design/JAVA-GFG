class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int ip= 0;//insert position
        int n = arr.length;
        for (int i = 0 ; i<n;i++){
            if (arr[i] !=0){
                arr[ip] = arr[i];
                ip++;
            }
        }
        while(ip<n){
        arr[ip++]=0;
    }

    }
}