package ArrayList;
import java.util.HashSet;

public class MaximumSumOfUniqueSubArrays 
{
		public static void main(String[] args) 
		{
			int arr[]= {1,2,2,4,4,3};
			System.out.println(subArraySum(arr));
		}
		public static int subArraySum(int arr[])
		{
			int max = Integer.MIN_VALUE;
			int currentSum = 0;
			HashSet<Integer> set = new HashSet<Integer>();
			int i=0,j=0;
			while(i<arr.length)
			{
				if(!set.contains(arr[i]))
				{
					set.add(arr[i]);
					currentSum+=arr[i];
					if(currentSum>max)
						max=currentSum;
				}
				else
				{
					while(set.contains(arr[i]))
					{
						set.remove(arr[j]);
						currentSum-=arr[j];
						j++;
					}
					set.add(arr[i]);
					currentSum+=arr[i];
				}
				i++;
			}
			return max;
			
		
		}

}
