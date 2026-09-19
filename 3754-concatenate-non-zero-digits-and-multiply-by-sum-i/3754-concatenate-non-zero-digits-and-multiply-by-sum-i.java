class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        int num=0;
        while(n>0){
            int digit = n%10;
            if(digit != 0){
                num = num*10+digit;
                sum += digit;
            }
            n /=10;
        }
        int x= rev(num);
        return (long)sum*x;
    }

    private int rev(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum = sum*10+digit;
            n /=10;
        }
        return sum;
    }
}