package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class AddElementsOfAnArray {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements of the array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		addElements(arr);
	}
	public static void addElements(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum: "+sum);
	}

}
