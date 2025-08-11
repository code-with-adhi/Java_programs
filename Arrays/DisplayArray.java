package Arrays;
import java.util.Arrays;

public class DisplayArray {
	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		int[] arr2= {1,2,3,4};
		int[] arr3= {1,2,3,4,5};
		int[] arr = new int[] {1,2,3,4,5};
		
		System.out.println("Array 1: Size 3");
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
		
		System.out.println("Array 2: Size 4");
		for(int x:arr2)
			System.out.println(x);
		
		System.out.println("Array 3: Size 5");
		System.out.println(Arrays.toString(arr3));
		
		

}
}

