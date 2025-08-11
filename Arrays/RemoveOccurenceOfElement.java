package Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class RemoveOccurenceOfElement {
	    public static void main(String[] args) {
	        int arr[] = {4, 2, 3, 3, 3, 8, 4};
	        System.out.println(Arrays.toString(arr));
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the element to remove: ");
	        int removeElement = sc.nextInt();
	        
	        int count = 0;
	        for (int num : arr) {
	            if (num == removeElement) {
	                count++;
	            }
	        }

	        if (count == 0) {
	            System.out.println("Element not found! Original array: " + Arrays.toString(arr));
	            return;
	        }

	        int[] res = new int[arr.length - count];
	        int pos = 0;
	        for (int num : arr) {
	            if (num != removeElement) {
	                res[pos++] = num;
	            }
	        }

	        System.out.println("Array after removing " + removeElement + ": " + Arrays.toString(res));
	     
	    }
	}



