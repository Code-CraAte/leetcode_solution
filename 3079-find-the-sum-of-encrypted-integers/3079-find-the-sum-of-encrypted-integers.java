class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int temp = num;
            int maxDigit = 0;
            int digits = 0;
            
            while (temp > 0) {
                int digit = temp % 10;
                maxDigit = Math.max(maxDigit, digit);
                digits++;
                temp /= 10;
            }
            int encrypted = 0;
            for (int i = 0; i < digits; i++) {
                encrypted = encrypted * 10 + maxDigit;
            }
            sum += encrypted;
        }
        return sum;
    }
}