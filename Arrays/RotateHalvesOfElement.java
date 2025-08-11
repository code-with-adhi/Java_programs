package Arrays;
import java.util.Arrays;
public class RotateHalvesOfElement {
	    public static void rotatePart(int[] arr, int start, int end) {
	        int last = arr[end];  
	        for (int i = end; i > start; i--) {
	            arr[i] = arr[i - 1];
	        }
	        arr[start] = last;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

	        int mid = arr.length / 2;
	        
	        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
	        rotatePart(arr1, 0, mid - 1);
	        System.out.println("First half rotated: " + Arrays.toString(arr1));

	        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
	        rotatePart(arr2, mid, arr.length - 1);
	        System.out.println("Second half rotated: " + Arrays.toString(arr2));

	        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};
	        rotatePart(arr3, 0, mid - 1);
	        rotatePart(arr3, mid, arr.length - 1);
	        System.out.println("Both halves rotated separately: " + Arrays.toString(arr3));
	    }
	}
