import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = 0;
        for(int x=0; x<nums1.length;x++){
            if(nums1[x]==0 && p<nums2.length){
                nums1[x] = nums2[p];
                p++;
            }
        }
        Arrays.sort(nums1);
    }
}