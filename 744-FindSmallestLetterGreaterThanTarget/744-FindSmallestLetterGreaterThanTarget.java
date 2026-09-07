// Last updated: 9/6/2026, 9:32:06 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = letters[0];
        boolean flag = false;

        for(char ch : letters){
            if(!flag){
                if(ch > target){
                    res = ch;
                    flag = !flag;
                }
            } else {
                if(ch > target && ch < res)res = ch;
            }
        }

        return res;
    }
}