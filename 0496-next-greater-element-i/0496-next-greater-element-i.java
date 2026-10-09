
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = -1;
            for (int j = 0; j < n; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j + 1; k < n; k++) {
                        if (nums2[k] > nums2[j]) {
                            ans[i] = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return ans;
    }
}