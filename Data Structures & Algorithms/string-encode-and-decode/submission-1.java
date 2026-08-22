class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();     //make a stringbuilder
        for(String s : strs){                       //parse each word in it
            sb.append(s.length()).append('#').append(s);    //add length,#,actual string
        }
        return sb.toString();               //return as encoded string
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();        //make an arraylist
        int i = 0;                                  //set i = 0
        while(i<str.length()){                      //iterate through each char of string
            int j = str.indexOf('#',i);             //find the position of #
            int len = Integer.parseInt(str.substring(i,j)); //find the length of the string
            String word = str.substring(j+1,j+1+len);   //find the actual substring
            result.add(word);                       //add the string to the result arraylist
            i = j+1+len;                        //go to the next word(i = j+1+len)
        }
        return result;                  //return result
    }
}
