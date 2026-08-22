class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s:strs){
            char chars[] = new char[10];
            chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(hm.containsKey(key)){
                hm.get(key).add(s);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(s);
                hm.put(key,list);
            }
        }
        return new ArrayList(hm.values());
    }
}
