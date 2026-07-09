// Last updated: 7/9/2026, 9:50:59 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            String s = Integer.toString(i);
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}