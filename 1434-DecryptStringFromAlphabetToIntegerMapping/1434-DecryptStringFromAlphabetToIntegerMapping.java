// Last updated: 7/9/2026, 9:50:57 AM
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
                result.append((char) ('a' + num - 1));
                i += 3;
            } else {
                int num = s.charAt(i) - '0';
                result.append((char) ('a' + num - 1));
                i++;
            }
        }

        return result.toString();
    }
}