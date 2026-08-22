class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        ArrayList<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return res;
        }
        backtrack(0,digits,"",res,map);
        return res;
    }
    public void backtrack(int index,String digits,String current,List<String>res,HashMap<Character,String> map){
        if(index == digits.length()){
            res.add(current);
            return;
        }   
        char digit = digits.charAt(index);       
        String letters = map.get(digit);        //fetch all the letters from that digit

        for(int i=0;i<letters.length();i++){
            current = current + letters.charAt(i);      //concat letters

            backtrack(index+1,digits,current,res,map);

            current = current.substring(0,current.length() - 1);
        }
    }
}
