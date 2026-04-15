// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
               int sum = 0;
        int ans = n;
        while(n != 0){
            int num = n%10;
            sum += Math.pow(num,3);
            n /= 10;
        }
        
        return sum == ans;
    }
}