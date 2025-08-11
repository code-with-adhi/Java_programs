package Arrays;
import java.util.Scanner;

public class MinimumTemperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr= new double[7];
		System.out.println("Enter the temperature");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextDouble();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
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
