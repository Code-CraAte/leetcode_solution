class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double minsum = Double.MAX_VALUE;
        int n = nums.length;
        for (int i=0; i<n/2; i++) {
            int j = n-1-i;

            double sum = (nums[i]+nums[j])/2.0;
            minsum = Math.min(sum,minsum);
        }
        return minsum;
    }
}