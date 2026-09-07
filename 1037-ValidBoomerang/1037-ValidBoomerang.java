// Last updated: 9/6/2026, 9:29:00 PM
class Solution {
    public boolean isBoomerang(int[][] points) {
       return (points[1][1]-points[0][1])*(points[2][0]-points[1][0]) != (points[2][1]-points[1][1])*(points[1][0]-points[0][0]); 
    }
}