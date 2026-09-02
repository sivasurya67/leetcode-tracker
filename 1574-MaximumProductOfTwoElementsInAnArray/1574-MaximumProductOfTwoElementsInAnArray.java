// Last updated: 9/1/2026, 9:57:40 PM
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        return(nums[n-1]-1)*(nums[n-2]-1);
    }
}