// Last updated: 9/6/2026, 9:30:21 PM
public class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 2) return true;
        int direction = 0;  
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) { 
                if (direction == 0) direction = 1;
                else if (direction == -1) return false;
            } else if (nums[i] < nums[i-1]) {  // decreasing
                if (direction == 0) direction = -1;
                else if (direction == 1) return false;
            }
        }
        return true;
    }
}