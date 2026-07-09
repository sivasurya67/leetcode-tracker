// Last updated: 7/9/2026, 9:49:32 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for (String str : patterns) {
            if (word.indexOf(str) != -1) {
                ans++;
            }
        }
        return ans;
    }
}