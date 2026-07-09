// Last updated: 7/9/2026, 9:51:45 AM


class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] in = new int[N + 1];
        int[] out = new int[N + 1];
        for (int[] a : trust) {
            out[a[0]]++;
            in[a[1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (in[i] == N - 1 && out[i] == 0)
                return i;
        }
        return -1;
    }
}
