package Patterns;

public class FloydsPattern {
	public static void main(String[] args) {
		int a=1,n=5;
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
					System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}

}
