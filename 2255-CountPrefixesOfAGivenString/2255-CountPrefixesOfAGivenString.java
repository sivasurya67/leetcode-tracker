// Last updated: 9/6/2026, 9:22:23 PM
class Solution {
    public int countPrefixes(String[] words, String s) {

        int count = 0;

        for (String word : words) {
            if (s.startsWith(word)) {
                count++;
            }
        }

        return count;
    }
}