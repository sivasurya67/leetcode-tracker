// Last updated: 7/16/2026, 2:27:41 PM
1class Solution {
2    public int countValidSelections(int[] nums) {
3        int total = 0, ls = 0, cases = 0;
4        for (int num : nums) total += num;
5
6        for (int num : nums) {
7            int rs = total - ls - num;
8            if (num == 0) {
9                if (ls == rs) {
10                    cases += 2;
11                } else if (ls == rs - 1 || ls - 1 == rs) {
12                    cases += 1;
13                }
14            }
15            ls += num;
16        }
17        return cases;
18    }
19}