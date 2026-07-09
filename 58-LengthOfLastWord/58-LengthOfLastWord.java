// Last updated: 7/9/2026, 9:54:35 AM
public class Solution {  
    public int lengthOfLastWord(String s) {  
        s = s.trim();  
        int lastSpaceIndex = s.lastIndexOf(' ');  
        return s.length() - (lastSpaceIndex + 1);  
    }  
}  