package Arrays;


public class MissingElementInARange {
	
		    public static void findMissing(int[] arr) {
		        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		        for (int num : arr) {
		            min = Math.min(min, num);
		            max = Math.max(max, num);
		        }

		        System.out.print("Missing Elements: ");
		        for (int i = min; i <= max; i++) {
		            boolean found = false;
		            for (int num : arr) {
		                if (num == i) {
		                    found = true;
		                    break;
		                }
		            }
		            if (!found) {
		                System.out.print(i + " ");
		            }
		        }
		    }

		    public static void main(String[] args) {
		        int[] arr = {1, 4, 5, 7, 10};
		        findMissing(arr);
		    }




	}

