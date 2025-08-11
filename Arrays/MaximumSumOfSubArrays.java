package Arrays;

public class MaximumSumOfSubArrays 
{
	public static int subArraySum(int arr[])
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum+=arr[k];
				}
				if(sum>max)
					max=sum;
			}
			}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		System.out.println(subArraySum(arr));
	}
	
}
