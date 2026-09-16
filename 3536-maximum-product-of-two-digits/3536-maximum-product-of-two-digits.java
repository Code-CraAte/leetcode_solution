class Solution {
    public int maxProduct(int n) {
       int pro=0;
       int maxpro=0;
       ArrayList<Integer> arr = new ArrayList<>();
       while(n>0){
        int digit = n%10;
        arr.add(digit);
        n /= 10;
       }
       for(int i=0; i<arr.size(); i++){
        for(int j=i+1; j<arr.size(); j++){
            pro = arr.get(i) * arr.get(j);
             maxpro = Math.max(maxpro,pro);
        }
       }
      
       return maxpro;
    }
}