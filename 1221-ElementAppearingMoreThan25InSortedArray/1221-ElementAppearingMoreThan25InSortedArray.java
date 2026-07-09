// Last updated: 7/9/2026, 9:51:25 AM
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