class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
     List<Integer> current = new ArrayList<>();
     List<List<Integer>> res = new ArrayList<>();
     backtrack(0,current,res,nums,target);
     return res;   
    }
    public void backtrack(int index, List<Integer> current, List<List<Integer>> res, int nums[], int target){
        if(target == 0){
            res.add(new ArrayList<>(current));
            return;
        }
        if(index == nums.length){
            return;
        }
        if(nums[index] <= target){
            current.add(nums[index]);
            backtrack(index,current,res,nums,target - nums[index]);
            current.remove(current.size() - 1);
        }
        backtrack(index+1,current,res,nums,target);
    }
}
