class Solution {
    public int[] findArray(int[] pref) {
        int [] ans =new int [pref.length];
        int dig =0;
        for(int i=0;i<pref.length;i++){
            dig ^=pref[i];
            ans[i]=dig;
            dig=pref[i];
        }
        return ans;
    }
    
}