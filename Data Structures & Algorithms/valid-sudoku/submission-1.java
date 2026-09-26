class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        int n = board.length;
        int m = board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] != '.'){
                    char number = board[i][j];

                    String row = number + "is present in" + i + "row";
                    String col = number + "is present in" + j + "col";
                    String block = number + "is present in" + i/3 + "-" + j/3 + "block";

                    if(seen.contains(row) || seen.contains(col) || seen.contains(block)){
                        return false;
                    }
                    seen.add(row);
                    seen.add(col);
                    seen.add(block);
                }
            }
        }
        return true;
    }
}
