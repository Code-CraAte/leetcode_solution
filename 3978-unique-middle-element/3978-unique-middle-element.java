class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int middle = nums[n/2];
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == middle){
                count++;
            }
        }
        if(count >1){
            return false;
        }
        return true;
        

    }
}