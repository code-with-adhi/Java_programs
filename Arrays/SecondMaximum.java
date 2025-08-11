package Arrays;
import java.util.Arrays;

public class SecondMaximum {
	
		public static void main(String[] args) {
			int arr[]= {9,6,1,7,9};
			System.out.println("Maximum of the array: ");
			System.out.println(secondmax(arr));
			System.out.println(secondmaximum(arr));
			
			
		}
		public static int secondmax(int arr[])
		{ 
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length-1;j++)
				{
				
				if(arr[i]>arr[j])
					{int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
			}
			}
		
			System.out.println(Arrays.toString(arr));
			int max=arr[arr.length-2];
			if(max==arr[arr.length-1])
				return (arr[arr.length-3]);
			else
				return max;
		}
		public static int secondmaximum(int arr[])
		{
			
				int max,smax;
				max=smax=Integer.MIN_VALUE;
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]>max)
					{
						smax=max;
						max=arr[i];
					}
					else if(arr[i]>smax && arr[i]!=max)
						smax=arr[i];
				}
				
				return smax;
		}

	}
