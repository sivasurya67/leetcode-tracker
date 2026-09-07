// Last updated: 9/6/2026, 9:30:14 PM
class Solution {
    public int smallestRangeI(int[] nums, int k) {

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        return (min + k) > (max - k) ? 0 : (max - k) - (min + k);
    }
}