package Arrays;

import java.util.Arrays;

public class TransposeOfAMatrix {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{3,2,1}};
		int [][]res = transpose(arr);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(res));
	}
	
	public static int[][] transpose(int[][] arr)
	{
		int[][] res = new int[arr[0].length][arr.length];
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				res[i][j]=arr[j][i];
			}
		}
		return res;
	}

}
