class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0;    //pointer of word1
        int j = 0;  //pointer for word2
        while(i!=word1.length() && j!=word2.length()){
            sb.append(word1.charAt(i)); //append from word1
            sb.append(word2.charAt(j)); //appnd from word2
            i++;    //increment pointer of word1
            j++;    //increment pointer of word2
        }
        sb.append(word1.substring(i));  //append the remaining chars of word1
        sb.append(word2.substring(j));  //append the remaining chars of word2

        return sb.toString();
    }
}