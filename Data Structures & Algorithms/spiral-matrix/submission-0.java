class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        // set up the 4 boundaries of the matrix
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(top<=bottom && left<=right){
            // go right across the top row
            for(int i = left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;  // top row done, move boundary down

            // go down the right column
            for(int j=top;j<=bottom;j++){
                result.add(matrix[j][right]);
            }
            right--;    // right col done, move boundary left
            // go left across the bottom row (only if row still valid)
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;   // bottom row done, move boundary up
            }
            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    result.add(matrix[j][left]);
                }
                left++;     // left col done, move boundary right
            }
        }
        return result;
    }
}