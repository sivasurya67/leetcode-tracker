// Last updated: 7/9/2026, 9:51:39 AM
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];

        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }

        int result = 0;

        for (String word : words) {
            int[] temp = charCount.clone();
            boolean canForm = true;

            for (char c : word.toCharArray()) {
                if (temp[c - 'a'] == 0) {
                    canForm = false;
                    break;
                }
                temp[c - 'a']--;
            }

            if (canForm) {
                result += word.length();
            }
        }

        return result;
    }
}