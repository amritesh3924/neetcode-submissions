class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxpile = 0;
        for(int pile:piles){
            if(pile>maxpile){
                maxpile = pile;
            }
        }

        int low = 1;
        int high = maxpile;
        while(low<high){
            int mid = low +(high-low)/2;
            int hours = 0;
            for(int pile:piles){
                hours += (pile+mid-1)/mid;
            }
            if(hours<=h){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
