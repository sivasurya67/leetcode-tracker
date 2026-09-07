// Last updated: 9/6/2026, 9:29:10 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int val = 0;

        for (int n : nums) {
            val = ((val << 1) + n) % 5;
            res.add(val == 0);
        }

        return res;
    }
}
