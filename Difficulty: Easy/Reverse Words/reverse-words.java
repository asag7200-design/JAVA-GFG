class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] words=s.split("\\.+");
                StringBuilder result=new StringBuilder();
                for (int i=words.length-1; i>=0; i--){
                    if(!words[i].isEmpty()){
                        if(result.length()>0){
                            result.append(".");
                        }
                        result.append(words[i]);
                    }
                }
                return result.toString();
    }
}
