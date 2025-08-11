package Arrays;

import java.util.Arrays;

public class SwapAdjacent {
	public static void main(String[] args) {
		int arr[]= {10,20,42,45,23,31,53};
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length - 1; i += 2) 
		{ 
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
		System.out.println(Arrays.toString(arr));
	}

}
