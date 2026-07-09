// Last updated: 7/9/2026, 9:50:53 AM
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;

        int[][] rows = new int[m][2];

        for (int i = 0; i < m; i++) {
            int soldiers = 0;

            for (int num : mat[i]) {
                soldiers += num;
            }

            rows[i][0] = soldiers;
            rows[i][1] = i;
        }

        Arrays.sort(rows, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = rows[i][1];
        }

        return result;
    }
}