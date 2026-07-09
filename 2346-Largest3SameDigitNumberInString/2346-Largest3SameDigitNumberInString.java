// Last updated: 7/9/2026, 9:49:22 AM
class Solution {
    public String largestGoodInteger(String num) {

        String best = "";

        for (int i = 0; i <= num.length() - 3; i++) {

            char c1 = num.charAt(i);
            char c2 = num.charAt(i + 1);
            char c3 = num.charAt(i + 2);

            if (c1 == c2 && c2 == c3) {
                String candidate = num.substring(i, i + 3);

                if (candidate.compareTo(best) > 0) {
                    best = candidate;
                }
            }
        }

        return best;
    }
}