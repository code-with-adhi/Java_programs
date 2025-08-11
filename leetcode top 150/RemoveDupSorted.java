import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int max=Integer.MIN_VALUE;
        for(int f: nums){
            if(f>max){
                max=f;
            }
        }
        for(int i =0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    nums[j] = max;
                }
            }
        }

        Arrays.sort(nums);

        for(int l : nums){
            if(l!=max){
                k++;
            }
        }
        
        return k+1;
    }
}