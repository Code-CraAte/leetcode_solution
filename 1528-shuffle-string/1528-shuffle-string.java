class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (i < indices.length) {
            for (int j = 0; j < indices.length; j++) {
                if (i == indices[j]) {
                    ans.append(s.charAt(j));
                    i++;
                }
            }
        }
        return ans.toString();
    }
}