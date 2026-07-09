// Last updated: 7/9/2026, 9:50:40 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int [nums.length];
        int k = 0 ;

         for(int i = 0 ; i< nums.length ; i++){
            for(int j = 0 ; j<nums.length ; j++){
               if(nums[i] > nums[j] ){
                  k = k+1 ;

               }
                
            }
            ans[i]  = k ; 
            k = 0 ;

            
         } return ans ;
    }
}