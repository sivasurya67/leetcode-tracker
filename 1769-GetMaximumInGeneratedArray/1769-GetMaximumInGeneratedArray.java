// Last updated: 7/9/2026, 9:50:08 AM
class Solution {
    public int getMaximumGenerated(int n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        int[] nums = new int[n + 1];

        nums[0] = 0;
        nums[1] = 1;

        int ans = 1;

        for (int i = 1; 2 * i <= n; i++) {

            nums[2 * i] = nums[i];
            ans = Math.max(ans, nums[2 * i]);

            if (2 * i + 1 <= n) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
                ans = Math.max(ans, nums[2 * i + 1]);
            }
        }

        return ans;
    }
}