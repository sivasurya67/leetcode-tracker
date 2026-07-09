// Last updated: 7/9/2026, 9:50:18 AM
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}