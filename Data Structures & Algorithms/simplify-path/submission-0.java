class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>();
        for(String i : arr){
            if(!st.isEmpty() && i.equals("..")){
                st.pop();
            }
            else if(!i.equals(".") && !i.equals("..") && !i.equals("")){
                st.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String a : st){
            sb.append("/");
            sb.append(a);
        }
        if(sb.length() == 0){
            return "/";
        }
        return sb.toString();
    }
}