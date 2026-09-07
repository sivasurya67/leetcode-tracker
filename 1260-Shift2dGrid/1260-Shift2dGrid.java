// Last updated: 9/6/2026, 9:27:31 PM
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k %= total;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                int idx = (i * n + j - k + total) % total;
                int row = idx / n;
                int col = idx % n;

                ans.get(i).add(grid[row][col]);
            }
        }

        return ans;
    }
}