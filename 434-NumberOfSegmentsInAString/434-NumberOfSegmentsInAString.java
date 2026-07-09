// Last updated: 7/9/2026, 9:53:14 AM
class Solution {
    public int countSegments(String s) {
        if (s.trim().length() == 0 || s == null) 
            return 0;
        else {
            String[] strs = s.trim().split("\\s+");
            return strs.length;
        }
    }
}