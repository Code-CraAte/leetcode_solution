class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i=0; i<nums1.length; i++){
        ans.add(nums1[i]);
       }
       for(int i=0; i<nums2.length; i++){
        ans.add(nums2[i]);
       }
      Collections.sort(ans);
       int n= ans.size();
       double mid =0;
        if(n%2 != 0) return ans.get(n/2);

        mid = (ans.get(n / 2 - 1) + ans.get(n / 2)) / 2.0;

        return mid;

        
    }
}