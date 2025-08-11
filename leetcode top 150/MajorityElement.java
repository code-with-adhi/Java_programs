class Solution {
    public int majorityElement(int[] nums) {
        int maj = 0;
        int res = 0;
        int n = Integer.MIN_VALUE;
        for(int i: nums){
            maj = checkCount(i, nums);

            if(res<maj){
                res=maj;
                n = i;
            }
        }
        return n;
    }

    public int checkCount(int e, int[] nums){
        int count = 0;
        for(int i: nums){
            if(i == e){
                count ++;
            }
        }

        return count;
    }
}

//GPT
// public class Solution {
//     public int majorityElement(int[] nums) {
//         int candidate = nums[0];
//         int count = 1;
        
//         // First pass to find the candidate
//         for (int i = 1; i < nums.length; i++) {
//             if (count == 0) {
//                 candidate = nums[i];
//                 count = 1;
//             } else if (nums[i] == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }
        
//         // Return the candidate, which is guaranteed to be the majority element
//         return candidate;
//     }
// }
