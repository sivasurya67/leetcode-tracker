// Last updated: 7/15/2026, 2:57:01 PM
1class Solution {
2    public int[] limitOccurrences(int[] nums, int k) {
3        int i=0;
4        for(int n:nums){
5            if(i<k||n!=nums[i-k]){
6                nums[i++]=n;
7            }
8        }
9        return Arrays.copyOf(nums,i);
10    }
11}