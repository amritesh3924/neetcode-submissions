class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            //if there is an "+" operation
            if(operations[i].equals("+")){
                int temp1 = st.pop();
                int temp2 = st.pop();
                int temp3 = temp1 + temp2;
                st.push(temp2);
                st.push(temp1);
                st.push(temp3);
            } 
            //if there is a "C" operation
            else if(operations[i].equals("C")){
                st.pop();
            }
            //if there is a "D" operation
            else if(operations[i].equals("D")){
                int prev = st.pop();
                int product = 2*prev;
                st.push(prev);
                st.push(product);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(st.size()!=0){
            sum = sum + st.pop();
        }
        return sum;
    }
}