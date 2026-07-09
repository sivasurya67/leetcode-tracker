// Last updated: 7/9/2026, 9:50:16 AM
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int good = 0;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                        Math.abs(arr[j] - arr[k]) <= b &&
                        Math.abs(arr[i] - arr[k]) <= c) {
                        good++;
                    }
                }
            }
        }
        return good;
    }
}