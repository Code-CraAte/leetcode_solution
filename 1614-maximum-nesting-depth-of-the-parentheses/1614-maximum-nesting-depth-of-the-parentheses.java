class Solution {
    public int maxDepth(String s) {
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
                max = Math.max(max, left);
            } else if (s.charAt(i) == ')') {
                left--;
            }
        }
        return max;
    }
}