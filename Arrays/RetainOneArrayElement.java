package Arrays;
import java.util.Arrays;


public class RetainOneArrayElement {

	    public static int[] retainElements(int[] arr1, int[] arr2) {
	        int count = 0;
	        for (int num : arr1) {
	            if (isInArray(num, arr2)) 
	            	count++;
	        }
	        
	        int[] result = new int[count];
	        int index = 0;
	        for (int num : arr1) {
	            if (isInArray(num, arr2)) {
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
	        int[] arr2 = {2, 4};
	        System.out.println("Retained Elements: " + Arrays.toString(retainElements(arr1, arr2)));
	    }
	}
