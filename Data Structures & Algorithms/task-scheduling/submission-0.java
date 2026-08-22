class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char t : tasks){
            freq[t - 'A'] ++;
        }

        int maxfreq = 0;
        for(int f : freq){
            maxfreq = Math.max(f,maxfreq);
        }

        int maxCount = 0;
        for(int f : freq){
            if(f == maxfreq){
                maxCount++;
            }
        }

        int partCount = maxfreq - 1;
        int partLength = n + 1;
        int minTime = partCount * partLength + maxCount;

        return Math.max(minTime,tasks.length);
    }
}
