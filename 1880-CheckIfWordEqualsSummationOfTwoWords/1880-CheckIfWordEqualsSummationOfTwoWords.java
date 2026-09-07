// Last updated: 9/6/2026, 9:23:16 PM
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