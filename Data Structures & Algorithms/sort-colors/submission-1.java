class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        // low = end of 0s, mid = current, high = start of 2s

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid); // move 0 to front
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++; // 1 is already in place
            } else {
                swap(nums, mid, high); // move 2 to back
                high--;
                // mid stays — need to recheck swapped value
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/*
0's -------> low will take care
1's ------> mid will take care
2's ------> high will take care
*/