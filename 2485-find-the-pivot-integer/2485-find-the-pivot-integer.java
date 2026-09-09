class Solution {
    public int pivotInteger(int n) {
        int totalsum = n*(n+1)/2;
        int leftsum = 0;
        int rightsum =0;
        for(int i=1; i<=n; i++){
            leftsum += i;
            rightsum = totalsum - leftsum + i;

            if(leftsum ==rightsum){
                return i;
            }
        }
        return -1;
    }
}