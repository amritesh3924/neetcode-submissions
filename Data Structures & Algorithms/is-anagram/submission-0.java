class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        if(n!=m){
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i=0;i<n;i++){
            if(s1[i] != t1[i]){
                return false;
            }
        }
        return true;
    }
}
