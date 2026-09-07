// Last updated: 9/6/2026, 9:28:22 PM
class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 1;

            while (i + 1 < n && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }

            if (count > n / 4) {
                return arr[i];
            }
        }

        return -1;
    }
}