class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0;
        int prod=1;
        int ans=0;
        int org = n;
        while(n>0){
            int digit = n%10;
            sum += digit;
            prod *= digit;
            n /=10;
        }
        ans = sum+prod;
        if(org%ans==0){
            return true;
        }
        return false;
    }
}