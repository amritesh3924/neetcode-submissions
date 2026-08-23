class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;           //Handles 0 and 1
        }
       int high = x/2;  //sqrt cant be greater than its half
       int low = 1;
       while(low<=high){
        int mid = low + (high-low)/2;
        long sqr = (long) mid*mid;          //to avoid overflow
        if(sqr == x){
            return mid;
        }
        else if(sqr < x){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
       }
       return high; 
    }
}