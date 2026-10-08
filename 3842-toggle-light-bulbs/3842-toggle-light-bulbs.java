class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Collections.sort(bulbs);
        List<Integer> ans = new ArrayList<>();
        int n = bulbs.size();
        for (int i = 0; i < n; ) {
            int count = 0;
            int value = bulbs.get(i);
            while (i < n && bulbs.get(i) == value) {
                count++;
                i++;
            }
            if (count % 2 == 1) {
                ans.add(value);
            }
        }
        return ans;
    }
}