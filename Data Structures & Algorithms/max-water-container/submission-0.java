class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int curSum = 0;
        int maxSum = 0;
        while(left<right){
            int h = Math.min(heights[left],heights[right]);
            curSum = h * (right - left);
            maxSum = Math.max(curSum,maxSum);
            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxSum;
    }
}
