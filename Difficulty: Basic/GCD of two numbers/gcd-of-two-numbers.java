class Solution {
    public static int gcd(int a, int b) {
        // code here
        while(b!=0){
        int rem = a%b;
        a=b;
        b=rem;    
        }
        return a;
    }
}
