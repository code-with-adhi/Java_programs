package Arrays;

public class LeftAndRightIndexSameValues {
		public static void main(String[] args) {
			int[] arr= {1,3,2,3,2,3,2,5};
			findIndex(arr);
		}
		
		static void findIndex(int[] arr)
		{
			
			int res =-1;
			for(int i=0; i<arr.length; i++)
			{
				boolean found= false;
				for(int j=arr.length-1; j>i; j--)
				{
					if(arr[i]==arr[j])
					{
						res=i;
						found = true;
					}
				}
				if(found)	
					break;
			}
			if(res==-1)	
				System.out.println("No Same Element found");
			else	
				System.out.println("Same element found at " + res);
		}
	}

