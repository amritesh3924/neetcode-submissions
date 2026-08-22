class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int curFuel = 0;
        int totalFuel = 0;
        for(int i=0;i<gas.length;i++){
            curFuel += gas[i] - cost[i];
            totalFuel += gas[i] - cost[i];

            if(curFuel < 0){
                start = i+1;
                curFuel = 0;
            }
        }
        if(totalFuel < 0){
            return -1;
        }
        return start;
    }
}
