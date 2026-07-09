// Last updated: 7/9/2026, 9:50:32 AM
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        List<Integer> result = new ArrayList<>();
        int subseqSum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            subseqSum += nums[i];
            result.add(nums[i]);

            if (subseqSum > totalSum - subseqSum) {
                break;
            }
        }

        return result;
    }
}