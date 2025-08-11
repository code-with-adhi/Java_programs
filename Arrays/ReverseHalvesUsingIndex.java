package Arrays;

import java.util.Arrays;

public class ReverseHalvesUsingIndex {
		    public static void main(String[] args) {
		        int[] arr = {1, 4, 2, 4, 5, 2};
		        System.out.println("Original Array: " + Arrays.toString(arr));
		        System.out.println("Reverse even index: " + Arrays.toString(evenIndex(arr)));
		        System.out.println("Reverse odd index: " + Arrays.toString(oddIndex(arr)));
		    }

		    public static int[] evenIndex(int arr[]) {
		         int[] result = new int[arr.length/2];
		         int pos = 0;
		         for (int i = arr.length - 1; i >= 0; i--) {
		             if (i % 2 == 0) {
		                 result[pos] = arr[i];
		                 pos++;
		             }
		         }

		         return result;
		     }
	

		    public static int[] oddIndex(int arr[]) {
		    
		         int[] result = new int[arr.length/2];
		         int pos = 0;
		         for (int i = arr.length - 1; i >= 0; i--) {
		             if (i % 2 != 0) {
		                 result[pos] = arr[i];
		                 pos++;
		             }
		         }

		         return result;
		    }
		}


