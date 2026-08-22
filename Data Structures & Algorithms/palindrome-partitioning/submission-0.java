class Solution {
    public List<List<String>> partition(String s) {
        List<String> current = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        backtrack(0,current,res,s);
        return res;
    }
    public void backtrack(int index, List<String> current, List<List<String>> res, String s){
        int n = s.length();
        if(index == n){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<n;i++){
            String piece = s.substring(index,i+1);

            if(isPalindrome(piece)){
                current.add(piece);
                backtrack(i+1,current,res,s);
                current.remove(current.size()-1);
            }
        }
    }
    public boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
