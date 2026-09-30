class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int minsum =0;
        int left=0;
        int right = nums.length-1;
        while(left<right){
            sum = nums[left] + nums[right];
            minsum = Math.max(sum,minsum);
            left++;
            right--;
        }
        return minsum;
    }
}
