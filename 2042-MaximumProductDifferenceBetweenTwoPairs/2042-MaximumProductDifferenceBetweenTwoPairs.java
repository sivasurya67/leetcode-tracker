// Last updated: 7/9/2026, 9:49:34 AM
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        return (nums[n - 1] * nums[n - 2]) -
               (nums[0] * nums[1]);
    }
}