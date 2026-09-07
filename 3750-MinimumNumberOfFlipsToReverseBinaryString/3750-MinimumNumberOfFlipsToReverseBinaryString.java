// Last updated: 9/6/2026, 9:21:09 PM
class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                count += 2;
            }
            left++;
            right--;
        }
        return count;
    }
}