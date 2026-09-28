class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int freq = -1;
        for(char key : map.keySet()){
            if(freq == -1){
                freq = map.get(key);
            }else if(freq != map.get(key)){
                return false;
            }
        }
        return true;
    }
}