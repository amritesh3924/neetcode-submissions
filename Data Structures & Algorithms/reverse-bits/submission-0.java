class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i=0;i<32;i++){
            int RightMostBit = (n&1);
            n = n >> 1;
            res = res << 1;
            res = res | RightMostBit;
        }
        return res;
    }
}
