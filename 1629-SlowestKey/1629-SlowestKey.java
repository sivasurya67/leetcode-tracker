// Last updated: 9/6/2026, 9:24:18 PM
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char ans = keysPressed.charAt(0);
        int max = releaseTimes[0];
        for(int i = 1; i< releaseTimes.length  ;i++){
           
                int diff = Math.abs(releaseTimes[i - 1] -releaseTimes[i]);
                 if (diff > max || (diff == max && keysPressed.charAt(i) > ans)) {
                max = diff;
                ans = keysPressed.charAt(i);
            }
        }
        return ans;
    }
}