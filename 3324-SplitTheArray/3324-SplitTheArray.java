// Last updated: 7/9/2026, 9:49:11 AM
class Solution {
    public boolean isPossibleToSplit(int[] nums) {

        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;

            if (count[num] > 2) {
                return false;
            }
        }

        return true;
    }
}