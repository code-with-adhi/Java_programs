package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class IndexOfAnElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {10,20,12,31,42,12};
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter element: ");
		int element = sc.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
				{System.out.println("Index: "+i);
				found=true;}
		}
		if(found==false)
			System.out.println("Element not found in array");
	}
}


