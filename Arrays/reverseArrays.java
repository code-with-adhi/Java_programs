package Arrays;
import java.util.Arrays;

public class reverseArrays {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int i=0,j=arr.length-1;
		while(i<j)
		{
			int first = arr[i];
			arr[i]=arr[j];
			arr[j]=first;
			i++;
			j--;		
		}
		System.out.println(Arrays.toString(arr));
		
		

	}

}
