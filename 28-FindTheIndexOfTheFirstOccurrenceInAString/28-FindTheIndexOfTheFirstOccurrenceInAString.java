// Last updated: 7/9/2026, 9:54:46 AM
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int result1 = solution.strStr(haystack1, needle1);
        System.out.println(result1); 
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int result2 = solution.strStr(haystack2, needle2);
        System.out.println(result2); 
    }
}