// Last updated: 7/9/2026, 9:49:45 AM
class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int index, int xor) {
        if (index == nums.length) {
            return xor;
        }

        // Include current element
        int include = dfs(nums, index + 1, xor ^ nums[index]);

        // Exclude current element
        int exclude = dfs(nums, index + 1, xor);

        return include + exclude;
    }
}