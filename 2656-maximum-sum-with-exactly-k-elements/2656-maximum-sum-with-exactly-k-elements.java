class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int sum = 0;
        while(k>0){
            sum += nums[n];
             nums[n]++;
             k--;
        }
        return sum;
    }
}