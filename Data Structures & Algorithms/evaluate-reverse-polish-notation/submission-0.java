class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> st = new Stack<>();
      int n = tokens.length;
      for(int i=0;i<n;i++){
        String token = tokens[i];
        if(!token.equals("+")&&!token.equals("-")&&!token.equals("*")&&!token.equals("/")){
            st.push(Integer.parseInt(token));       //convert string into integer before pushing
        }
        else if(token.equals("+")){
            int op2 = st.pop();
            int op1 = st.pop();
            int res = op1 + op2;
            st.push(res);
        }
        else if(token.equals("-")){
            int op2 = st.pop();
            int op1 = st.pop();
            int res = op1 - op2;
            st.push(res);
        }
        else if(token.equals("*")){
            int op2 = st.pop();
            int op1 = st.pop();
            int res = op1 * op2;
            st.push(res);
        }
        else if(token.equals("/")){
            int op2 = st.pop();
            int op1 = st.pop();
            int res = op1 / op2;
            st.push(res);
        }
      }  
      return st.peek();
    }
}
