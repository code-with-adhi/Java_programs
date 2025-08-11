package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class AverageOfElementsUsingIndex {
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
	System.out.println("Even Index Average: "+evenIndexAvg(arr));
	System.out.println("Odd Index Average: "+oddIndexAvg(arr));
	
}
public static double evenIndexAvg(int arr[])
{
	int sum=0,count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(i%2==0)
			{
			sum+=arr[i];
			count++;
			}
	}

	return sum/count;
}
public static double oddIndexAvg(int arr[])
{
	int sum=0,count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(i%2!=0)
		{
			sum+=arr[i];
			count++;
		}
	}

	return sum/count;
}

}

		