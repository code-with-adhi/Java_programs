package Patterns;
import java.util.Scanner;

public class RightDiagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stars: ");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==(n+1-i))
					System.out.print("* ");
				
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}

}
