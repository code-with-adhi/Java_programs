package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int[] arr=new int[5];
		System.out.println(arr);
		System.out.println(arr[0]);
		arr[0]=10;
		arr[1]=20;
		int a=10;
		arr[2]=a;
		arr[3] = 10+20;
		System.out.println(arr[0]);
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i : arr)
		{
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] arr1=new int[5];
		System.out.println(arr1.length);
		System.out.println(arr1[-1]);
		System.out.println(arr1[5]);
		System.out.println(arr1[6]);
		
		
		int[] arr2={1,2,3,4,5};
		System.out.println(arr2.length);
		System.out.println(Arrays.toString(display()));
		int[] arr5 = new int[] {1,2,3,4,5};
		System.out.println(arr5.length);
		
	}
	public static int[] display()
	{
		int[] arr2={1,2,3,4,5};
		return arr2;
	}
	

}
