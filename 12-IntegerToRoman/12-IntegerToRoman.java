// Last updated: 7/9/2026, 9:55:06 AM
class Solution {
    public String intToRoman(int num) {
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(romanSymbols[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num1 = 3749;
        String result1 = solution.intToRoman(num1);
        System.out.println(result1);  
        int num2 = 58;
        String result2 = solution.intToRoman(num2);
        System.out.println(result2);  
        int num3 = 1994;
        String result3 = solution.intToRoman(num3);
        System.out.println(result3);  
    }
}