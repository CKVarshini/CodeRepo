/*
According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.

 

Example 1:


Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
Example 2:


Input: board = [[1,1],[1,0]]
Output: [[1,1],[1,1]]
*/

class Solution {
  public void gameOfLife(int[][] board) {

      // Define directions to visit neighboring cells

      int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
      int x = board[0].length; // Number of columns in the board
      int y = board.length; // Number of rows in the board

      // Iterate through each cell in the board

      for (int i = 0; i < y; i++) {
          for (int j = 0; j < x; j++) {
              int liveNeighbors = 0; // Initialize the count of live neighbors for the current cell
              
              // Count the live neighbors of the current cell

              for (int[] dir : directions) {
                  int h = j + dir[1]; // Horizontal position of the neighbor
                  int v = i + dir[0]; // Vertical position of the neighbor
                  // Check if the neighbor is within the bounds of the board and is alive (1) or dead (-1)
                  if (h >= 0 && h < x && v < y && v >= 0 && (board[v][h] == 1 || board[v][h] == -1)) {
                      liveNeighbors++; // Increment the count of live neighbors
                  }
              }
              
              // Determine the next state of the current cell based on its current state and the count of live neighbors
              
              if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                  board[i][j] = -1; // Next state: Dead
              }
              if (board[i][j] == 0 && liveNeighbors == 3) {
                  board[i][j] = 2; // Next state: Alive
              }
          }
      }
      
      // Update the board based on the encoded next states
      
      for (int i = 0; i < y; i++) {
          for (int j = 0; j < x; j++) {
              if (board[i][j] == -1) {
                  board[i][j] = 0; // Dead
              } else if (board[i][j] == 2) {
                  board[i][j] = 1; // Alive
              }
          }
      }
  }
}