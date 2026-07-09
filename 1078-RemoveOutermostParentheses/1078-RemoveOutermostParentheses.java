// Last updated: 7/9/2026, 9:51:40 AM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        char[] a = s.toCharArray();
        int n = a.length;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] == '(') {
                count++;
                ans.append('(');
            } else {
                if (count == 0) {
                    i++;
                } else {
                    ans.append(')');
                    count--;
                }
            }
        }
        return ans.toString();
    }
}