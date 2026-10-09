
import java.util.*;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int[] ans = new int[k];
        int m = 0;
        int n = nums.length;
        for (int i = n - 1; i >= 0 && m < k; i--) {
            if (i == n - 1 || nums[i] != nums[i + 1]) {
                ans[m] = nums[i];
                m++;
            }
        }
        return Arrays.copyOf(ans, m);
    }
}