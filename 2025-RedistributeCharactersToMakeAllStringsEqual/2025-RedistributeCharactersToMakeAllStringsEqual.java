// Last updated: 7/9/2026, 9:49:37 AM
class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];

        for (String word : words) {
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
        }

        int n = words.length;

        for (int freq : count) {
            if (freq % n != 0) {
                return false;
            }
        }

        return true;
    }
}