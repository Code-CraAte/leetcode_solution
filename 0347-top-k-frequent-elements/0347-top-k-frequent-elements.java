class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {

            if(ans.containsKey(nums[i])) {
                ans.put(nums[i], ans.get(nums[i]) + 1);
            } else {
                ans.put(nums[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(ans.keySet());
        list.sort((a, b) -> ans.get(b) - ans.get(a));
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}