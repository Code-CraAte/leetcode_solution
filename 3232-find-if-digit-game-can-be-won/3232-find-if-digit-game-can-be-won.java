class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0; i<nums.length; i++){
           if(nums[i] <10){
            sum1 += nums[i];
           }else{
            sum2 += nums[i];
           }
        }
        int alice = Math.max(sum1,sum2);
        int bob = Math.min(sum1,sum2);
        if(alice <= bob){
            return false;
        }
        return true;
        
    }
}