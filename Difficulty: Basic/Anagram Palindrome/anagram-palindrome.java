class Solution {
    boolean canFormPalindrome(String s) {
        // code here
                int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a'] ^= 1;
        }
        int oddCount = 0;
        for (int val : freq) oddCount += val;
        return oddCount <= 1;
    }
}