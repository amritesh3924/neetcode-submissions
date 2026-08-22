class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int n = nums.length;
        int i = 0;
        int sum = 0;
        for(int j=0;j<n;j++){
            sum = sum + nums[j];
            while(sum >= target){
                result = Math.min(result,j-i+1);
                sum = sum - nums[i];
                i++;
            }
        }
        if(result == Integer.MAX_VALUE){
            return 0;
        }
        return result;
    }
}