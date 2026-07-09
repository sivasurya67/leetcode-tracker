// Last updated: 7/9/2026, 9:49:14 AM
class Solution {
    public int maxSum(int[] nums) {

        int max = -1;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (largestDigit(nums[i]) == largestDigit(nums[j])) {

                    max = Math.max(max, nums[i] + nums[j]);
                }
            }
        }

        return max;
    }

    public int largestDigit(int n) {

        int maxDigit = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            n = n / 10;
        }

        return maxDigit;
    }
}