/*
 An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image 
 by rounding down the average of the cell and the eight surrounding cells
(i.e., the average of the nine cells in the blue smoother). 
If one or more of the surrounding cells of a cell is not present, we do not consider
it in the average (i.e., the average of the four cells in the red smoother).
*/

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = calculateAverage(img, i, j);
            }
        }

        return result;
    }

    private int calculateAverage(int[][] img, int row, int col) {
        int sum = 0;
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (0 <= i && i < img.length && 0 <= j && j < img[0].length) {
                    sum += img[i][j];
                    count++;
                }
            }
        }

        return sum / count;
    }
}
