// Last updated: 9/6/2026, 9:30:06 PM
class Solution {
    public int minAddToMakeValid(String s) {
        int left = 0, right = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                left++;
            }else{
                if(left == 0) right++;
                else left--;
            }
        }
        return left+right;
    }
}