/*
 You are given an integer matrix isWater of size m x n that represents a map of land and water cells.

If isWater[i][j] == 0, cell (i, j) is a land cell.
If isWater[i][j] == 1, cell (i, j) is a water cell.
You must assign each cell a height in a way that follows these rules:

The height of each cell must be non-negative.
If the cell is a water cell, its height must be 0.
Any two adjacent cells must have an absolute height difference of at most 1. A cell is adjacent to another cell if the former is directly north, east, south, or west of the latter (i.e., their sides are touching).
Find an assignment of heights such that the maximum height in the matrix is maximized.

Return an integer matrix height of size m x n where height[i][j] is cell (i, j)'s height. 
If there are multiple solutions, return any of them.

Example 1:
[[1 0]
[2 1]]


Input: isWater = [[0,1],[0,0]]
Output: [[1,0],[2,1]]
Explanation: The image shows the assigned heights of each cell.
The blue cell is the water cell, and the green cells are the land cells.
 */

 import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] heights = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();

        // Initialize water cells and add them to the queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    heights[i][j] = 0;
                    queue.add(new int[]{i, j});
                } else {
                    heights[i][j] = -1; // Mark land cells as unvisited
                }
            }
        }

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // Right, Down, Left, Up

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();

            for (int[] direction : directions) {
                int newRow = cell[0] + direction[0];
                int newCol = cell[1] + direction[1];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && heights[newRow][newCol] == -1) {
                    heights[newRow][newCol] = heights[cell[0]][cell[1]] + 1;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }

        return heights;
    }
}

