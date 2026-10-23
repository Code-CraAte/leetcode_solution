class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        Solve(nums, index,ans, output);
        return ans;
    }
    static void Solve(int[] num,int index,List<List<Integer>> ans,List<Integer> output){
        if(index >= num.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        int currval = num[index];
        //include:-
        output.add(currval);
        Solve(num, index+1, ans, output);
        //backtrack step:-
        output.remove(output.size()-1);
        //exclude:-
        Solve(num, index+1, ans, output);
    }
}