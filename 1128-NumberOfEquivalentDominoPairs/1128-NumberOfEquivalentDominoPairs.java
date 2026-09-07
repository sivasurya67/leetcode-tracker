// Last updated: 9/6/2026, 9:28:19 PM
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int result = 0;

        for (int[] d : dominoes) {
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);

            int key = a * 10 + b;

            result += count[key];
            count[key]++;
        }

        return result;
    }
}