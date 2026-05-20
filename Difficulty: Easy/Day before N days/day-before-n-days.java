class Solution {
    public int dayBefore(int d, int n) {
        // code here
         if(d>n) {
            return d-n;
        }
        else {
            n=n%7;
            n=7-n;
            return d+n;
        }    
    }
}