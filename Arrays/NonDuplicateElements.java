package Arrays;
import java.util.Arrays;
public class NonDuplicateElements {

		public static void main(String[] args) {       
			int[] arr = {1, 2, 3, 2, 4, 5, 5, 6};
	        
	        int[] res = findNonDuplicateElements(arr);    
	        System.out.println("Given Array: " + Arrays.toString(arr));
	        System.out.println("Non-Duplicate Elements: " + Arrays.toString(res));
	    }
		
		static int[] findNonDuplicateElements(int[] arr) {
			int[] newArr = new int[arr.length];
			int ind = 0;

			for (int i = 0; i < arr.length; i++) {
				boolean dup = false;
				for (int j = 0; j < arr.length; j++) {
					if (i!=j&&arr[i] == arr[j]) {
						dup = true;
						break;
					}
				}
				if (!dup) {
					newArr[ind++] = arr[i];
				}
			}
			System.out.println(Arrays.toString(newArr));

			int[] res = new int[ind];
			for (int i = 0; i < ind; i++) {
				res[i] = newArr[i];
			}

			return res;			
		}
	}



