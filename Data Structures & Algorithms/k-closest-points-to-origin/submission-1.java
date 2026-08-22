class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));

        int result[][] = new int[k][2];

        for(int i=0;i<points.length;i++){
            maxheap.add(points[i]);
            if(maxheap.size()>k){
                maxheap.remove();
            }
        }
        for(int i=0;i<k;i++){
            result[i] = maxheap.remove();
        }
        return result;
    }
}
