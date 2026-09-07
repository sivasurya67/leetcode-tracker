// Last updated: 9/6/2026, 9:23:01 PM
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        return (nums[n - 1] * nums[n - 2]) -
               (nums[0] * nums[1]);
    }
}