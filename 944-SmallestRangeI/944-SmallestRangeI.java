// Last updated: 7/9/2026, 9:52:04 AM
class Solution {
    public int smallestRangeI(int[] nums, int k) {

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        return (min + k) > (max - k) ? 0 : (max - k) - (min + k);
    }
}