class Solution {
    public static String reverseString(String s) {
        // code here
             String reverse = "";
             char ch;
        for(int i = 0; i < s.length(); i++){
           ch = s.charAt(i); 
           reverse = ch + reverse;
           }
        return reverse;
    }
}