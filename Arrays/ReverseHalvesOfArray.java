package Arrays;

import java.util.Arrays;

public class ReverseHalvesOfArray {
	    public static void main(String[] args) {
	        int[] arr = {1, 4, 2, 4, 5, 2};
	        System.out.println("Original Array: " + Arrays.toString(arr));
	        System.out.println("Reverse first Half: " + Arrays.toString(firstHalf(arr)));
	        System.out.println("Reverse second Half: " + Arrays.toString(secondHalf(arr)));
	    }

	    public static int[] firstHalf(int arr[]) {
	        int mid = arr.length / 2;
	        int[] arr1 = new int[mid];
	        int pos = 0;

	        for (int i = mid - 1; i >= 0; i--) {
	            arr1[pos] = arr[i];
	            pos++;
	        }
	        return arr1;
	    }

	    public static int[] secondHalf(int arr[]) {
	        int mid = arr.length / 2;
	        int[] arr1 = new int[arr.length - mid];
	        int pos = 0;

	        for (int i = arr.length - 1; i >= mid; i--) {
	            arr1[pos] = arr[i];
	            pos++;
	        }
	        return arr1;
	    }
	}


