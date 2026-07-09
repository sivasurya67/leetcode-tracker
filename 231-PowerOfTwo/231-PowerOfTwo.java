// Last updated: 7/9/2026, 9:53:38 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<=0)return false;
        if(n==1)return true;
        if(n%2!=0)return false;
        return isPowerOfTwo(n/2);
        
    }
}