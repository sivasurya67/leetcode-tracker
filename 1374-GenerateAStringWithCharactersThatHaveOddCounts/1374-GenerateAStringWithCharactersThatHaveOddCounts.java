// Last updated: 9/6/2026, 9:26:17 PM
class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                sb.append('a');
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                sb.append('a');
            }
            sb.append('b');
        }

        return sb.toString();
    }
}