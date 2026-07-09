// Last updated: 7/9/2026, 9:52:57 AM
class Solution {
    public boolean checkValidString(String s) {
        int low = 0, high = 0;
        for (char c : s.toCharArray()) {
            low += (c == '(') ? 1 : -1;
            high += (c != ')') ? 1 : -1;
            if (high < 0) return false;
            low = Math.max(low, 0);
        }
        return low == 0;
    }
}