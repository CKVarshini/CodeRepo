/*
 Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100

 */

 class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
      int row = matrix.length;
      int col = matrix[0].length;

      List<Integer> ans = new ArrayList<Integer>(); 

      int startrow = 0;
      int lastcol = col-1;
      int lastrow = row-1;
      int startcol = 0;

      int i=0;

      while(i < row*col){

          //startrow
          for( int j=startcol; j<=lastcol; j++){
              ans.add(matrix[startrow][j]);
              i++;
          }
          startrow++;
          if(i == row*col){
              break;
          }

          //lastcol
          for(int j=startrow; j<=lastrow; j++){
              ans.add(matrix[j][lastcol]);
              i++;
          }
          lastcol--;
          if(i == row*col){
              break;
          }

          //lastrow
          for(int j=lastcol; j>=startcol; j--){
              ans.add(matrix[lastrow][j]);
              i++;
          }
          lastrow--;
          if(i == row*col){
              break;
          }

          //startcol
          for(int j=lastrow; j>=startrow; j--){
              ans.add(matrix[j][startcol]);
              i++;
          }
          startcol++;
      }

      return ans;
  }
}