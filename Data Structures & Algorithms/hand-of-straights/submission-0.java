class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int n : hand){
            if(map.containsKey(n)){
                map.put(n,map.get(n) + 1);
            }
            else{
                map.put(n,1);
            }
        }

        while(map.size()!=0){
            int start = map.firstKey();
            for(int i=0;i<groupSize;i++){
                int current = start+i;

                if(map.get(current) == null){
                    return false;
                }

                map.put(current,map.get(current)-1);

                if(map.get(current) == 0){
                    map.remove(current);
                }
            }
        }
        return true;
    }
}
