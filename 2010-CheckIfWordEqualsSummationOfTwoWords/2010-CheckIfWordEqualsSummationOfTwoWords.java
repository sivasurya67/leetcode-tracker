// Last updated: 7/9/2026, 9:49:41 AM
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getValue(firstWord) + getValue(secondWord) == getValue(targetWord);
    }

    private int getValue(String word) {
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {
            sb.append(c - 'a');
        }

        return Integer.parseInt(sb.toString());
    }
}