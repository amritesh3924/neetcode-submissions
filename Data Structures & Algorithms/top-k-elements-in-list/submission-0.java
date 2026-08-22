class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       //STEP 1: Create a freq HashMap
       HashMap<Integer,Integer> freq = new HashMap<>();
       int n = nums.length;
       for(int i=0;i<n;i++){
        if(freq.containsKey(nums[i])){
            freq.put(nums[i],freq.get(nums[i]) + 1);
        }
        else{
            freq.put(nums[i],1);
        }
       }

       //STEP 2: Make an ArrayList to store all the unique keys
       List<Integer> elements = new ArrayList<>(freq.keySet());
       //sort the keys in descending order
       Collections.sort(elements, (a,b) -> freq.get(b) - freq.get(a));

       //STEP 3: Store top k values in resultant array
       int result [] = new int[k];
       for(int i=0;i<k;i++){
           result[i] = elements.get(i); //fetch from arraylist
       }
       return result;
    }
}
