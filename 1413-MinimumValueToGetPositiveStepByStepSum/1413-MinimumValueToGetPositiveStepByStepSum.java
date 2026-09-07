// Last updated: 9/6/2026, 9:26:07 PM
class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minPrefix = 0;

        for (int num : nums) {
            sum += num;
            minPrefix = Math.min(minPrefix, sum);
        }

        return 1 - minPrefix;
    }
}