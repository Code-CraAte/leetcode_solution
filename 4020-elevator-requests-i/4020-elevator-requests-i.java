class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int m=requests.length;
        int sum=0;
        for(int i=1;i<m;i++){
            sum += Math.abs(requests[i-1]-requests[i]);
        }
        return sum+requests[0];
    }
}