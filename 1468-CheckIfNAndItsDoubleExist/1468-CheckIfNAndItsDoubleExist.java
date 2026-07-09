// Last updated: 7/9/2026, 9:50:51 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
	    int n = arr.length;
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                if (i != j && arr[i] == 2 * arr[j]) 
                    return true;

        return false;
    }
}
