class Solution {
    public int[] separateDigits(int[] nums) {
        String s = "";
        for(int i=0; i<nums.length; i++){
            s += nums[i];
        }
        int[] ans = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            ans[i] += s.charAt(i) - '0';
        }
        return ans;
    }
}