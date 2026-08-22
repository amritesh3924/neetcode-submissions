class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.isEmpty()){
            int temp = st1.pop();
            st2.push(temp);
        }

        int popped = st2.pop();
        
        while(!st2.isEmpty()){
            int temp1 = st2.pop();
            st1.push(temp1);
        }
        return popped;
    }
    
    public int peek() {
        while(!st1.isEmpty()){
            int temp2 = st1.pop();
            st2.push(temp2);
        }
        int res = st2.peek();
        while(!st2.isEmpty()){
            int temp3 = st2.pop();
            st1.push(temp3);
        }
        return res;
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */