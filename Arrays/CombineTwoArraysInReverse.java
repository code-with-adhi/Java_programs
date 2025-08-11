package Arrays;
import java.util.Arrays;
public class CombineTwoArraysInReverse {
	
		public static void main(String[] args) {       
			int[] arr1= {0,1,2};
	        int[] arr2 = {3,4,5};
	        
	        int[] res = combineBut2ndReversed(arr1, arr2);    
	        System.out.println("Given Array: " + Arrays.toString(arr1));
	        System.out.println("Elements to Retain: " + Arrays.toString(arr2));
	        System.out.println("Resulting Array: " + Arrays.toString(res));
	    }
		static int[] combineBut2ndReversed(int[] arr1, int[] arr2)
		{
			int[] res = new int[arr1.length+arr2.length];
			int ind=0;
			for(int val: arr1)
				res[ind++] = val;
			for(int i=arr2.length-1; i>=0; i--)
				res[ind++] = arr2[i];
			return res;
					
		}
	}



