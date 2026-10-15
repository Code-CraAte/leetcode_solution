class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        for(int i=0;i<nums.length; i++){
            int max = nums[nums.length-1];
            while(nums[i] < max){
                nums[i] += 1;
                count++;
            }
        }
        return count;
    }
}