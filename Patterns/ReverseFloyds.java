package Patterns;

public class ReverseFloyds {
	public static void main(String[] args) {
		int a=1,n=5;
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				i = a*(a+1)/2;
				System.out.println(i + " ");
				a++;
			}
			i--;
		
		}
	}

}
