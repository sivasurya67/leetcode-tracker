// Last updated: 9/3/2026, 3:29:50 AM
1class Solution {
2    public boolean divideArray(int[] nums) {
3        Map<Integer, Integer> counter = new HashMap<>();
4        for (int num : nums) {
5            counter.put(num, counter.getOrDefault(num, 0) + 1);
6        }       
7        for (int count : counter.values()) {
8            if (count % 2 != 0) {
9                return false;
10            }
11        }
12        return true;
13    }
14}