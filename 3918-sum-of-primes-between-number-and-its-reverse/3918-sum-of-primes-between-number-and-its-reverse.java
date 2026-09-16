class Solution {
    public int sumOfPrimesInRange(int n) {
        int sum = 0;
        int rev =  reverse(n);
        int start = Math.min(n,rev);
        int end = Math.max(n,rev);

        for(int i=start; i<=end; i++){
            if(primeNumber(i)){
                sum += i;
            }}
            return sum;
    }
    private int reverse(int n){ // reverse function
        int rev =0;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n /= 10;
        }
        return rev;
    }
    private boolean primeNumber(int n) {  
        if (n < 2) return false;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            } }
        return true;
    }
}