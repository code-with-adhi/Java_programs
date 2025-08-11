package Arrays;

public class OccurenceOfElement {
	public static void main(String[] args) { 
		int arr[]= {4,2,3,3,3,8,4};
		int count;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			if(arr[i]!=Integer.MIN_VALUE)
			{
			for (int j=i+1;j<arr.length;j++)
			{
			if(arr[i]==arr[j])
				{
				arr[j]=Integer.MIN_VALUE;
				count++;
				}
			
			}
			System.out.println(arr[i]+": "+count);
			}
		
		
		}
	}
}

