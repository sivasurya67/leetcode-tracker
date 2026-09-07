// Last updated: 9/6/2026, 9:27:48 PM
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