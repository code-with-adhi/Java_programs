package Arrays;
import java.util.Arrays;
public class CombineTwoArray {

		public static void main(String[] args) {       
			int[] arr1= {0,1,2};
	        int[] arr2 = {3,4};
	        
	        int[] res = combine(arr1, arr2);    
	        System.out.println("Given Array: " + Arrays.toString(arr1));
	        System.out.println("Elements to Retain: " + Arrays.toString(arr2));
	        System.out.println("Resulting Array: " + Arrays.toString(res));
	    }
		
		static int[] combine(int[] arr1, int[] arr2)
		{
			int[] res = new int[arr1.length+arr2.length];
			int ind=0;
			for(int val: arr1)
				res[ind++] = val;
			for(int val: arr2)
				res[ind++] = val;
			return res;
					
		}
	}


