// Last updated: 7/9/2026, 9:53:49 AM
public class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int length = columnTitle.length();
        
        for (int i = 0; i < length; i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + value;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println(solution.titleToNumber("A"));  
        System.out.println(solution.titleToNumber("AB"));    
        System.out.println(solution.titleToNumber("ZY"));   
        System.out.println(solution.titleToNumber("FXSHRXW")); 
    }
}