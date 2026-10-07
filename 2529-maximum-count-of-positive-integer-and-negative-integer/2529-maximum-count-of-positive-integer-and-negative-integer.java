class Solution {
    public int maximumCount(int[] nums) {
        int poscount =0;
        int negcount =0;
        int ans =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0) negcount++;
            if(nums[i]<0) poscount++;

             ans = Math.max(poscount,negcount);
        }
         return ans;
    }
}