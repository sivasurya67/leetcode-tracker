// Last updated: 9/6/2026, 9:30:55 PM
class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0, level = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == '(')    
                level++;
            else    
                level--;
            if(s.charAt(i) == ')' && s.charAt(i-1) == '(')
                score += 1 << level;
        }
        return score;
    }
}