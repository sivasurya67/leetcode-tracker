// Last updated: 9/6/2026, 9:25:08 PM
class Solution {
    public int maxScore(String s) {
        int ones = 0;

        // Count total number of 1's
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }

        int zeros = 0;
        int maxScore = 0;

        // Try every possible split
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones--;
            }

            maxScore = Math.max(maxScore, zeros + ones);
        }

        return maxScore;
    }
}