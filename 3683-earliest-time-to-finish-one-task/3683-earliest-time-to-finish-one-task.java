class Solution {
    public int earliestTime(int[][] tasks) {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<tasks.length; i++){
            int start = tasks[i][0];
            int end = tasks[i][1];
            int finish = start+end;
            ans = Math.min(ans,finish);
        }
        return ans;
    }
}