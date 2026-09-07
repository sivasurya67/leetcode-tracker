// Last updated: 9/6/2026, 9:23:17 PM
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

        for (int num = left; num <= right; num++) {
            boolean covered = false;

            for (int[] range : ranges) {
                if (num >= range[0] && num <= range[1]) {
                    covered = true;
                    break;
                }
            }

            if (!covered) {
                return false;
            }
        }

        return true;
    }
}