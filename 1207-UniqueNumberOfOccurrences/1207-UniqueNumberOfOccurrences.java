// Last updated: 9/6/2026, 9:27:52 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Store frequencies in a set
        HashSet<Integer> set = new HashSet<>();

        for (int freq : map.values()) {
            if (!set.add(freq)) {
                return false;
            }
        }

        return true;
    }
}