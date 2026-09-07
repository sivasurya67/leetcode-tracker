// Last updated: 9/6/2026, 9:23:28 PM
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