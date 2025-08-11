package Arrays;
import java.util.Arrays; 

class MinimumOneDuplicate
{
		public static void main(String[] args) {
			int[] arr = {1,2,2,3,3,4,5,5,6,6};
			findMinOneDupli(arr);
		}
		
		static void findMinOneDupli(int[] arr)
		{
			int[] newArr = new int[arr.length];
			int ind=0;
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i]!=Integer.MIN_VALUE)
				{
					for(int j=i+1; j<arr.length; j++)
					{
						if(arr[i]==arr[j])
						{
							arr[j]=Integer.MIN_VALUE;
							newArr[ind++]= arr[i];
							break;
						}
					}
				}
		}
			System.out.println(Arrays.toString(newArr));
			
			int[] res = new int[ind];
			for(int i=0; i<res.length; i++)
				res[i] = newArr[i];
			System.out.println(Arrays.toString(res));
		}
	}


