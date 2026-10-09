
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ones = Math.min(numOnes, k);
        int sum = ones;
        k -= ones;
        int zeros = Math.min(numZeros, k);
        k -= zeros;
        sum -= k;

        return sum;
    }
}