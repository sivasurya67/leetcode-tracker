// Last updated: 7/9/2026, 9:50:36 AM
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int minCol = 0;

            // Find minimum element's column in current row
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            int candidate = matrix[i][minCol];
            boolean isLucky = true;

            // Check if candidate is maximum in its column
            for (int k = 0; k < m; k++) {
                if (matrix[k][minCol] > candidate) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                result.add(candidate);
            }
        }

        return result;
    }
}