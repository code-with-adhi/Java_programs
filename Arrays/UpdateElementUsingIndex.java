package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class UpdateElementUsingIndex {

	    public static void updateElement(int[] arr, int index, int newValue) {
	        if (index >= 0 && index < arr.length) {
	            arr[index] = newValue;
	            System.out.println("Updated Array: " + Arrays.toString(arr));
	        } else {
	            System.out.println("Invalid index");
	        }
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int[] arr = {10, 20, 30, 40, 50};
	    	System.out.println(Arrays.toString(arr));
	    	System.out.println("Enter index: ");
	    	int index = sc.nextInt();
	    	System.out.println("Enter element: ");
	    	int element=sc.nextInt();
	        updateElement(arr, index, element);
	    }
	}



