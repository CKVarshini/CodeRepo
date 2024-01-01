/*
  There is an m x n binary grid matrix with all the values set 0 initially. Design an algorithm to randomly pick an index (i, j) where matrix[i][j] == 0 and flips it to 1. All the indices (i, j) where matrix[i][j] == 0 should be equally likely to be returned.

Optimize your algorithm to minimize the number of calls made to the built-in random function of your language and optimize the time and space complexity.

Implement the Solution class:

Solution(int m, int n) Initializes the object with the size of the binary matrix m and n.
int[] flip() Returns a random index [i, j] of the matrix where matrix[i][j] == 0 and flips it to 1.
void reset() Resets all the values of the matrix to be 0.
 */


import java.util.*;

class Solution {
    private int totalZeros;
    private int numRows, numCols;
    private Map<Integer, Integer> zeroIndices;
    private Random random;

    public Solution(int m, int n) {
        numRows = m;
        numCols = n;
        totalZeros = m * n;
        zeroIndices = new HashMap<>();
        random = new Random();
    }

    public int[] flip() {
        if (totalZeros == 0) {
            return new int[]{-1, -1}; // No more zeros to flip
        }

        int randomIndex = random.nextInt(totalZeros);
        int originalIndex = zeroIndices.getOrDefault(randomIndex, randomIndex);

        // Swap the chosen index with the last remaining zero
        int lastIndex = totalZeros - 1;
        int[] originalCoords = getCoordinates(originalIndex);
        int[] lastCoords = getCoordinates(lastIndex);

        zeroIndices.put(randomIndex, zeroIndices.getOrDefault(lastIndex, lastIndex));
        zeroIndices.put(lastIndex, originalIndex);

        totalZeros--;

        return originalCoords;
    }

    public void reset() {
        zeroIndices.clear();
        totalZeros = numRows * numCols;
    }

    private int[] getCoordinates(int index) {
        int row = index / numCols;
        int col = index % numCols;
        return new int[]{row, col};
    }
}
