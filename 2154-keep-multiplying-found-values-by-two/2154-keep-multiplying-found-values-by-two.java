class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            while(nums[i] == original){
                original = 2*nums[i];
            }
        }
        return original;
    }
}