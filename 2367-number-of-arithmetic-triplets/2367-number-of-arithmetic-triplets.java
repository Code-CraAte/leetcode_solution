class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count =0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                for(int k=2; k<n; k++){
                    if(nums[j]-nums[i] ==diff &&  nums[k]- nums[j]== diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}