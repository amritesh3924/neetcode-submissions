class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                stack.push(ch);
            }
            else{
                //extract the substring
                StringBuilder str = new StringBuilder();
                while(stack.peek() != '['){
                    str.insert(0,stack.pop());
                }
                //remove the first bracket
                stack.pop();
                //now find the number behind it
                StringBuilder num = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    num.insert(0,stack.pop());
                }

                int repeat = Integer.parseInt(num.toString());

                //now make the substring "num" times
                StringBuilder repeated = new StringBuilder();
                for(int i=0;i<repeat;i++){
                    repeated.append(str);
                }

                //now put the string char-by-char into the stack back
                for(char c : repeated.toString().toCharArray()){
                    stack.push(c);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.insert(0,stack.pop());
        }
        return res.toString();
    }
}