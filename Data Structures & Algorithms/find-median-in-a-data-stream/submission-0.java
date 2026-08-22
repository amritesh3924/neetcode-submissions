class MedianFinder {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(left.size() == right.size()){
            right.add(num);
            int temp = right.remove();
            left.add(temp);
        }
        else{
            left.add(num);
            int temp1 = left.remove();
            right.add(temp1);
        }
    }
    
    public double findMedian() {
        if(left.size() != right.size()){
            return (double) left.peek();
        }
        else{
            return (double)(left.peek()+right.peek())/2.0;
        }
    }
}
