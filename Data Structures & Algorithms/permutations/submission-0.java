class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,current,res);
        return res;
    }

    public void backtrack(int nums[], List<Integer> current, List<List<Integer>> res){
        if(current.size() == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])){
                continue;
            }
            current.add(nums[i]);
            backtrack(nums,current,res);
            current.remove(current.size()-1);
        }
    }
}
