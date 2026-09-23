class Solution {
    int row;
    int col;
    int perimeter;
    public int islandPerimeter(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        perimeter = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1){
                    dfs(grid,i,j);
                    return perimeter;
                }
            }
        }
        return -1;
    }
    private void dfs(int grid[][],int i,int j){
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j] == 0){
            perimeter++;
            return;
        }
        if(grid[i][j] == -1){
            return;
        }
        
        grid[i][j] = -1;
        
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}