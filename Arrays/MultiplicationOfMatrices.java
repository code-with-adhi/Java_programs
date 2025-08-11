package Arrays;

import java.util.Arrays;

public class MultiplicationOfMatrices {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3},{1,3,4},{2,3,5}};
		int[][] arr2 = {{1,3,3},{2,3,6},{2,4,5}};
		int res[][]=multiplication(arr1,arr2);
		System.out.println(Arrays.deepToString(res));
 	}
	public static int[][] multiplication(int[][]arr1, int[][]arr2)
	{
		int[][] res = new int[arr1.length][arr2[0].length];
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[0].length;j++)
			{
				for(int k=0;k<res[0].length;k++) {
					res[i][j]+=arr1[i][k]*arr2[k][j];
				}
					
			}
		}
		return res;
	}

}
