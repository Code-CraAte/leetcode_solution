class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for (int i = 0; i < arr.length; i++) {
            int remainder = arr[i] % k;
            remainder = (remainder + k) % k;
            freq[remainder]++;
        }
        for (int remainder = 1; remainder < k; remainder++) {
            int partner = k - remainder;
            if (freq[remainder] != freq[partner]) {
                return false;
            }
        }
        if (freq[0] % 2 != 0) {
            return false;
        }
        return true;
    }
}