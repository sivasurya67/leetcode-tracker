// Last updated: 7/9/2026, 9:53:08 AM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }
        return reversedString.toString().trim();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input1 = "Let's take LeetCode contest";
        String result1 = solution.reverseWords(input1);
        System.out.println(result1);  
        String input2 = "Mr Ding";
        String result2 = solution.reverseWords(input2);
        System.out.println(result2); 
    }
}