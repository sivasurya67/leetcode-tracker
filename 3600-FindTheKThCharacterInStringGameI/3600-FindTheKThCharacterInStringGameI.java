// Last updated: 7/9/2026, 9:49:01 AM
//Java Code
class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            String str = "";
            for (char i = 0; i < word.length(); i++)
                str += ((word.charAt(i) == 'z') ? 'a' : (char) (word.charAt(i) + 1));
            word.append(str);
        }
        System.out.println(word);
        return word.charAt(k - 1);
    }
}