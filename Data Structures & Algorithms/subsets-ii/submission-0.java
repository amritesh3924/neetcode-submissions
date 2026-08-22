class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0,nums,current,res);
        return res;
    }
    public void backtrack(int index, int nums[], List<Integer>current, List<List<Integer>> res){
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
        //skip the repeating number
        while((index+1<nums.length) && nums[index] == nums[index+1]){
            index++;    //skip the repeating number
        }
        backtrack(index+1,nums,current,res);
    }
}
