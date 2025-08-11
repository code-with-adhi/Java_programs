package Arrays;

public class AdditionOfMatrices {
	public static void main(String[] args) {
		int[][] arr1= {{1,2,3,4},{2,3,4,7}};
		int[][] arr2= {{1,2,3,4},{2,3,4,7}};
		int[][] res=addition(arr1,arr2);
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] addition(int[][] arr1,int[][] arr2)
	{
		int[][] res = new int[arr1.length][arr1[0].length];
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				res[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		return res;
	}

}
