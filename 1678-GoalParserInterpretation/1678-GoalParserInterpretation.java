// Last updated: 9/6/2026, 9:24:03 PM
class Solution {
    public String interpret(String command) {
        String ans = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                ans += "G";
            }
            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                ans += "o";
                i++;
            }
            else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                ans += "al";
                i += 3;
            }
        }
        return ans;
    }
}