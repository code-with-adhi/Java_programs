package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfColumnElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int column = sc.nextInt();
		
		int[][] arr = new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
				arr[i][j]=sc.nextInt();
		}
		System.out.println(Arrays.deepToString(arr));
		int[] res = new int[column];
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
				res[i]+=arr[j][i];
		}
		
		int result=1;
		for(int a: res)
			result*=a;
		System.out.println(result);
		
	}

}
