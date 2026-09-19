class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int count = 0;
        while(n>0){
            count++;
            int digit = n%10;
            if(count%2!=0){
                sum += digit;
            }
            else{
                sum -= digit;
            }
            n /=10;
        }
       if(count %2==0){
        sum = -sum;
       }
       return sum;
    }
}