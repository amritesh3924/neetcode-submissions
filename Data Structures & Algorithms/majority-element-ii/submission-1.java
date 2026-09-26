class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        //iterate on keys of HashMap using keySet() method
        for(int num : map.keySet()){
            if(map.get(num) > n/3){
                res.add(num);
            }
        }
        return res;
    }
}