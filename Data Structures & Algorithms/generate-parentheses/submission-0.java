class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        backtrack(0,0,n,current,res);
        return res;
    }
    public void backtrack(int open, int close, int n, StringBuilder current, ArrayList<String> res){
        if(open == n && close == n){
            res.add(current.toString());    //convert StringBuilder into String before adding in result
            return; 
        }
        if(open < n){
            current.append('(');
            backtrack(open+1,close,n,current,res);
            current.deleteCharAt(current.length() - 1);
        }
        if(close < open){
            current.append(')');
            backtrack(open,close+1,n,current,res);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
