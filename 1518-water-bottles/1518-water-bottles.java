class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;
        while(empty >= numExchange){
            int extra = empty/numExchange;
            total += extra;
            empty = (empty%numExchange) + extra;
        }
        return total;
        
    }
}