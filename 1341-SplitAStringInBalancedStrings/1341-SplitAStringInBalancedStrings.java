// Last updated: 7/9/2026, 9:51:09 AM
class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}