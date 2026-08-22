class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        //initialize two arrays
        int s1Count[] = new int[26];
        int s2Count[] = new int[26];

        for(int i=0;i<s1.length();i++){
            s1Count[s1.charAt(i) - 'a']++;      //store freq at respective indexes
            s2Count[s2.charAt(i) - 'a']++;
        }
        //check both the array before sliding
        if(Arrays.equals(s1Count,s2Count)){
            return true;
        }

        //slide the window
        for(int i=s1.length();i<s2.length();i++){
            s2Count[s2.charAt(i) - 'a']++; //add a right character to the window
            s2Count[s2.charAt(i - s1.length()) - 'a']--;//remove left character from the window

            if(Arrays.equals(s1Count,s2Count)){
                return true;
            }
        }
        return false;
    }
}
