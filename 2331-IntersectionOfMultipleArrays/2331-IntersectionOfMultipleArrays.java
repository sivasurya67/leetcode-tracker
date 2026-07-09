// Last updated: 7/9/2026, 9:49:26 AM
import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int[] arr : nums) {
            Set<Integer> set = new HashSet<>();

            for (int num : arr) {
                set.add(num);
            }

            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> res = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == n) {
                res.add(key);
            }
        }

        Collections.sort(res);
        return res;
    }
}