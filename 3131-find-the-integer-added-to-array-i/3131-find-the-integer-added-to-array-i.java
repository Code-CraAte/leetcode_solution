class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
         Arrays.sort(nums2);
         int ans = 0;
         for(int i=0; i<nums1.length && i<nums2.length; i++){
            ans = nums2[i]-nums1[i];
         }
         return ans;
    }
}