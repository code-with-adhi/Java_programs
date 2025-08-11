package Arrays;

//maximum sum of sub array
public class SlidingWindow {
	public static void main(String[] args) {
		int[] arr = {10,2,4,5,8,7,9};
		int k=4;
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<=k+i-1&& j<arr.length;j++)
			{
				sum+=arr[j];
			}
			if(sum>max)
				max=sum;
		}
		System.out.println(max);
	}

}
