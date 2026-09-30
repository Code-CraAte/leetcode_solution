class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans = 0;
        int right = piles.length - 1;
        for (int i = 0; i < piles.length / 3; i++) { //Har round mein 3 piles use hote hain 
                                                     
            right--;            //second largest jo mera hai;
            ans += piles[right]; 
            right--;            
        }
        return ans;
    }
}