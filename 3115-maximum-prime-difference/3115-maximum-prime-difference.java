class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(isprime(nums[i])){
                ans.add(i);
            }
        }
         return ans.get(ans.size()-1) - ans.get(0);
    }
    private boolean isprime(int n){
         if (n <= 1) return false;
        for(int i=2; i<n; i++){
            if(n%i ==0) return false;
        }
        return true;
    }
}