class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n+1];
        for(int i=0;i<=n;i++){
            res[i] = countOne(i);
        }
        return res;
    }
    public int countOne(int num){
        int count = 0;
        for(int i=0;i<32;i++){
            if( (num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}
