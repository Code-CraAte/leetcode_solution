class Solution {
    public int smallestIndex(int[] nums) {
        int ans =0;
        int minans=0;
        for(int i=0; i<nums.length; i++){
            if(digitsum(nums[i]) == i){
                ans = i;
                return ans;
            }
        }
        return -1;
        
    }
    private int digitsum(int n){
        int sum =0;
        while(n>0){
            int digit = n%10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}