class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0,nums,current,res);
        return res;
    }

    public void backtrack(int index, int nums[], List<Integer>current, List<List<Integer>>res){
        //base case
        if(index == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        //include
        current.add(nums[index]);
        //pick
        backtrack(index+1,nums,current,res);
        //remove
        current.remove(current.size()-1);
        //not pick
        backtrack(index+1,nums,current,res);
    }
}
