class Solution {
    int row;
    int col;
    int curArea;
    int maxArea;
    public int maxAreaOfIsland(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        maxArea = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1){
                    curArea = 0;            //new island found reset curArea
                    dfs(grid,i,j);
                    maxArea = Math.max(curArea,maxArea);
                }
            }
        }
        return maxArea;
    }
    private void dfs(int grid[][], int i, int j){
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j] == 0){
            return;     //out of bound conditions
        }

        grid[i][j] = 0;         //mark the cell as unvisited and increase the area
        curArea++;          
    
        //make the recursive calls
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
