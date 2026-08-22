class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int res[] = merge(nums1,nums2);
       double median;
       if(res.length%2 ==0){
        median = (double)(res[res.length/2] + res[res.length/2 -1])/2;
       } 
       else{
        median = (double)res[res.length/2];
       }
       return median;
    }

    public int[] merge (int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length + arr2.length];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while(p1<arr1.length || p2<arr2.length){
            int val1 = p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2<arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if(val1<val2){
                ans[p3] = val1;
                p1++;
            }
            else{
                ans[p3] = val2;
                p2++;
            }
            p3++;
        }
        return ans;
    }
}
