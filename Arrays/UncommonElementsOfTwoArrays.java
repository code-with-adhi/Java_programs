package Arrays;
import java.util.Arrays;

public class UncommonElementsOfTwoArrays {

    public static void uncommonElements(int[] arr1, int[] arr2) {
        Arrays.sort(arr1); // Sort arr1
        Arrays.sort(arr2); // Sort arr2
        
        int i = 0, j = 0;
        
        // First loop: Traverse both arrays using two-pointer technique
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.println(arr1[i]); // arr1[i] is not in arr2
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.println(arr2[j]); // arr2[j] is not in arr1
                j++;
            } else {
                // If both are equal, skip the common element
                i++;
                j++;
            }
        }

        // Second loop: Print remaining elements from arr1 (if any)
        while (i < arr1.length) {
            System.out.println(arr1[i]);
            i++;
        }

        // Second loop: Print remaining elements from arr2 (if any)
        while (j < arr2.length) {
            System.out.println(arr2[j]);
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6};
        uncommonElements(arr1, arr2);
    }
}



