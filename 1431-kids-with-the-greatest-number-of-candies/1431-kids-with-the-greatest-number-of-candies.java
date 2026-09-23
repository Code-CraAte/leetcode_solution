class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> ans = new ArrayList<>();
        int max = maximun(candies);
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
    private int maximun(int[] arr){
        int num = 0;
        int maxnum =0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                num = arr[i+1];
            }else{
                num = arr[i];
            }
            maxnum = Math.max(num, maxnum);
        }
        return maxnum;

    }
}