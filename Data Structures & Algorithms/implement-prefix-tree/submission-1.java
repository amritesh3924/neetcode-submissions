class PrefixTree {
    static class Node{
        Node children[] = new Node[26];
        boolean eow;

        public Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public Node root;
    public PrefixTree() {
         root = new Node();
    }

    public void insert(String word) {
        int length = word.length();
        int idx = 0;

        Node curr = root;

        for(int i=0;i<length;i++){
            idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public boolean search(String word) {
        int length = word.length();
        int idx = 0;

        Node curr = root;

        for(int i=0;i<length;i++){
            idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public boolean startsWith(String prefix) {
        int length = prefix.length();
        int idx = 0;

        Node curr = root;

        for(int i=0;i<length;i++){
            idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
}
