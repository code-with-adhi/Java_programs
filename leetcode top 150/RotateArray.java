import java.util.*;
//brute force
class Solution {
    public void rotate(int[] nums, int k) {
         for(int i = 0; i < k; i++){
            int temp = nums[nums.length - 1];

            for( int j = nums.length-1; j>0; j-- ){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    } 
}

//optimal
public class RotateArray {

    class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length < 100){
            for(int i = 0; i < k; i++){
            int temp = nums[nums.length - 1];

                for( int j = nums.length-1; j>0; j-- ){
                    nums[j] = nums[j-1];
                }
                nums[0] = temp;
            }
        }
        else{
            reverse(nums, 0, nums.length-1);

            reverse(nums,0, k-1);

            reverse(nums, k, nums.length-1);
        }
    }
    public static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

}
}