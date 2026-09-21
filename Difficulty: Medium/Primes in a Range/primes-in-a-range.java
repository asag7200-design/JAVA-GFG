class Solution {
    public List<Integer> primeRange(int l, int r) {
        // code here
            ArrayList<Integer> ans = new ArrayList<>();

            for (int n = l; n <= r; n++) {
                if (isPrime(n)) {
                    ans.add(n);
                }
            }

            return ans;
        }

        boolean isPrime(int n) {
            if (n < 2) {
                return false;
            }

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }