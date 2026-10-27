
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int startRow = 0, startCol = 0;
        int endRow = n - 1, endCol = n - 1;
        int num = 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top
            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = num++;
            }

            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = num++;
            }

            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) break;
                matrix[endRow][j] = num++;
            }

            // Left
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) break;
                matrix[i][startCol] = num++;
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return matrix;
    }
}
