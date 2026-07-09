// Last updated: 7/9/2026, 9:51:37 AM
class Solution {
    public boolean isBoomerang(int[][] points) {
       return (points[1][1]-points[0][1])*(points[2][0]-points[1][0]) != (points[2][1]-points[1][1])*(points[1][0]-points[0][0]); 
    }
}