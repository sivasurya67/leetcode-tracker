// Last updated: 7/9/2026, 9:49:48 AM
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] arr = new String[words.length];

        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '1';
            arr[index] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", arr);
    }
}