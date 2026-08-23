class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int w : weights){
            low = Math.max(low,w);
            high = high + w;
        }

        //apply binary search 
        int res = high;                     //most potential result
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canbeShipped(weights,mid) <= days){
                res = mid;
                high = mid-1;       //try to find more optimal ans
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }

    private int canbeShipped(int[] weights, int capacity){
        int days = 1;
        int currentCapacity = 0;
        for(int w: weights){
            currentCapacity = currentCapacity + w;
            if(currentCapacity > capacity){
                days++;                         //increase days
                currentCapacity = w;
            }
        }
        return days;
    }
}