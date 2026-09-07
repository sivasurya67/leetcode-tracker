// Last updated: 9/6/2026, 9:27:16 PM
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