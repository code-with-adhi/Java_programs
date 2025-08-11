package Arrays;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] arr=new int[3][];
		//System.out.println(arr[0][0]);
		System.out.println(arr[0]);
		int[][] arr1=new int[3][2];
		System.out.println(arr1[0][0]);
		
		//for loop
		int[][] arr2 = {{10,20,20},{30,40,50}};
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		//for each
		for(int[] x:arr2)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		//new keyword
		int[][] arr3 = new int[2][3];
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
