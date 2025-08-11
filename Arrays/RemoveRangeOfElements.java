package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveRangeOfElements {

	public static int[] removeRange(int[] arr, int start, int end) {
	        if (start < 0 || end >= arr.length || start > end) {
	            System.out.println("Invalid range");
	            return arr;
	        }
	        int[] newArr = new int[arr.length - (end - start + 1)];
	        int index = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (i < start || i > end) {
	                newArr[index++] = arr[i];
	            }
	        }
	        return newArr;
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50, 60};
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter starting range: ");
	        int start = sc.nextInt();
	        System.out.println("Enter ending range: ");
	        int end = sc.nextInt();
	        System.out.println("Updated Array: " + Arrays.toString(removeRange(arr, start, end)));
	    }
	}

