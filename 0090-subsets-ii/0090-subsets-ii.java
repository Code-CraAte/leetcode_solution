class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> output = new ArrayList<>();
       int index= 0;
       Solve(nums, index, output, ans);
       return ans; 
    }
    static void Solve(int[] num, int index, List<Integer> output,List<List<Integer>> ans ){
        if(index >= num.length){
            ans.add(new ArrayList<>(output));
            return ;
        }
        int currval = num[index];
        //include:-
        output.add(currval);
        Solve(num, index+1, output, ans);
        //Backtracking step:-
        output.remove(output.size()-1);

        //using loop, for ingnore same element and move next different element.
        while(index+1 <num.length && num[index] == num[index+1]){
            index++;
        }
        //Exclude:-
        Solve(num, index+1,output,ans);
    }
}