class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
               Arrays.sort(b);
        int max = b[b.length - 1];
        int sum = 0;
        for(int i =0; i<n ; i++){
            sum = sum + a[i][i];
        }
ArrayList<Integer> result = new ArrayList<>();

        result.add(sum);
        result.add(max);

        return result;        
        
    }
}
