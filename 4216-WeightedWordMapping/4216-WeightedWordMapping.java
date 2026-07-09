// Last updated: 7/9/2026, 9:49:03 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            int sum = 0;
            for (char ch : word.toCharArray()) {
                sum += weights[ch - 'a'];
            }
            int mod = sum % 26;
            char mapped = (char) ('z' - mod);
            ans.append(mapped);
        }
        return ans.toString();
    }
}