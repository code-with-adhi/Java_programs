package Arrays;
import java.util.Scanner;

public class MinimumElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size=sc.nextInt();
		double[] arr= new double[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
				double temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
				
			}
		}
	System.out.println(arr[0]);
	}

}
