// Last updated: 7/9/2026, 9:50:49 AM
class Solution {
    public String sortString(String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();

        while (result.length() < s.length()) {

            // Increasing order
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    result.append((char)(i + 'a'));
                    count[i]--;
                }
            }

            // Decreasing order
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    result.append((char)(i + 'a'));
                    count[i]--;
                }
            }
        }

        return result.toString();
    }
}