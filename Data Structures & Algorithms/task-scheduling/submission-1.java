class Solution {
    public int leastInterval(char[] tasks, int n) {
        //store the chars in freq array
        int[] freq = new int[26];
        for(char t : tasks){
            freq[t - 'A'] ++;
        }

        //find the maximum freq of the task
        int maxfreq = 0;
        for(int f : freq){
            maxfreq = Math.max(f,maxfreq);
        }

        //if any other task has the maximum freq then increase the maxCount
        int maxCount = 0;
        for(int f : freq){
            if(f == maxfreq){
                maxCount++;
            }
        }


        int partCount = maxfreq - 1;    //gaps created
        int partLength = n + 1; //n+1 unit is consumed in one cycle
        int minTime = partCount * partLength + maxCount;    //formula to count

        return Math.max(minTime,tasks.length);
    }
}
