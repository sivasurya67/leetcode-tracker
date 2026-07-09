// Last updated: 7/9/2026, 9:52:31 AM
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
            "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };

        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(code[c - 'a']);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}