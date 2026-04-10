class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even = 0,odd=0;
        for (int num:arr){
            if(num%2==0)even++;
            
           else odd ++;
        }
        return new int[]{odd,even};
        }
    }
