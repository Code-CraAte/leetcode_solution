class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer, Integer> ans = new HashMap<>();
       for(int i=0; i<arr.length; i++){
        if(ans.containsKey(arr[i])){
            ans.put(arr[i], ans.get(arr[i])+1);
        }else{
            ans.put(arr[i],1);
        }
       }
       int max = -1;
       for(int i : ans.keySet()){
        if(i == ans.get(i)){
           max = Math.max(i, max);
        }
       }
       return max;
        
    }
}
