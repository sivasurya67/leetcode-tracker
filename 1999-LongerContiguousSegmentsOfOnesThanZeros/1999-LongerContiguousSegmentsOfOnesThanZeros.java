// Last updated: 7/9/2026, 9:49:44 AM
class Solution {
    public boolean checkZeroOnes(String s) {
        int maxOnes = 0, maxZeros = 0;
        int ones = 0, zeros = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
                zeros = 0;
                maxOnes = Math.max(maxOnes, ones);
            } else {
                zeros++;
                ones = 0;
                maxZeros = Math.max(maxZeros, zeros);
            }
        }

        return maxOnes > maxZeros;
    }
}