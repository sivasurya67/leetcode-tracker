// Last updated: 9/6/2026, 9:25:35 PM
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