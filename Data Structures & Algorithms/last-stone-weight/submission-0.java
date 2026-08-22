class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<stones.length;i++){
            maxheap.add(stones[i]);
        }

        while(maxheap.size()>1){
            int max = maxheap.remove();
            int temp = maxheap.remove();
            if(max!=temp){
                maxheap.add(max - temp);
            }
        }
        if(maxheap.isEmpty()){
            return 0;
        }
        return maxheap.peek();
    }
}
