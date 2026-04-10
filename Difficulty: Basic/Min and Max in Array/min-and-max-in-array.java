class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = arr[0];
        int max = arr[0];
        
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
