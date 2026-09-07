// Last updated: 9/6/2026, 9:22:09 PM
class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;

                for (int j = i; j < i + k && j < s.length(); j++) {
                    sum += s.charAt(j) - '0';
                }

                sb.append(sum);
            }

            s = sb.toString();
        }

        return s;
    }
}