package Arrays;
import java.util.Arrays;

public class CommonElementsOfTwoArrays {
	    public static int[] commonElements(int[] arr1, int[] arr2) {
	        int count = 0;
	        for (int num : arr2) {
	            if (isInArray(num, arr1)) 
	            	count++;
	        }

	        int[] result = new int[count];
	        int index = 0;
	        for (int num : arr2) {
	            if (isInArray(num, arr1)) {
	                result[index++] = num;
	            }
	        }
	        return result;
	    }

	    private static boolean isInArray(int num, int[] arr) {
	        for (int element : arr) {
	            if (element == num) 
	            	return true;
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {2, 4, 6};
	        System.out.println("Common Elements: " + Arrays.toString(commonElements(arr1, arr2)));
	    }


}
