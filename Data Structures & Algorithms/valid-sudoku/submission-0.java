class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int number = board[i][j];
                if(number!='.'){
                    String row = number + "is in row" + i;
                    String col = number + "is in col" + j;
                    String block = number + "is in block" + i/3 + "-" + j/3; 

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
