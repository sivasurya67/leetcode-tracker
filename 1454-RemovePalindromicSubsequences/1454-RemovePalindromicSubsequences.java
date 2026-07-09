// Last updated: 7/9/2026, 9:50:55 AM
class Solution {
    public int removePalindromeSub(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 2;
            }
            left++;
            right--;
        }

        return 1;
    }
}