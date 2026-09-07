// Last updated: 9/6/2026, 9:22:06 PM
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            int zero = 0;
            int one = 0;
            while (i < s.length() && s.charAt(i) == '0') {
                zero++;
                i++;
            }
            while (i < s.length() && s.charAt(i) == '1') {
                one++;
                i++;
            }
            ans = Math.max(ans, 2 * Math.min(zero, one));
        }
        return ans;
    }
}