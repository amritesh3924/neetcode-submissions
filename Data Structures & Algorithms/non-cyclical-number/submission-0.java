class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n = getsumofsquares(n);
        }
        return n == 1;
    }

    public int getsumofsquares(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum + digit*digit;
            n = n/10;
        }
        return sum;
    }
}
