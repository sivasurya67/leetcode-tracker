// Last updated: 9/6/2026, 9:27:20 PM
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