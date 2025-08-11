package Arrays;

import java.util.Arrays;

public class IndexOfGreatestElement {
	public static void main(String[] args) {
		int[] arr = {3,8,6,2,7,5};
		int maxNumIndex = greatest(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(maxNumIndex);
	}
	
	public static int greatest(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		int index = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]>max)
			{
				max = arr[i];
				index = i;
			}
			}
		}
		System.out.println(max);
		return index;
	}

}
