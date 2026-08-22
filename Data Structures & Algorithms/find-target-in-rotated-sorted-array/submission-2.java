class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while (low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[low]){  //left side is sorted
                if (target >= nums[low] && target <= nums[mid]){    //apply BS
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{                       //right side is sorted
                if(target >= nums[mid] && target <= nums[high]){    //apply BS
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
