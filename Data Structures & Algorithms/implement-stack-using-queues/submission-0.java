class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        //copy from q1 -----> q2
        while(!q1.isEmpty()){
            int temp = q1.remove();
            q2.add(temp);
        }
        //add the new element
        q1.add(x);
        //put back all the elements from q2 to q1
        while(!q2.isEmpty()){
            int temp1 = q2.remove();
            q1.add(temp1);
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */