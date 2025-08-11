package Patterns;

public class Number {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			int num=i;
			int j;
			for(j=1;j<=9;j++)
			{
				if(i>=j)
					{System.out.print(num+" ");
					num+=9-j;}
				}
			System.out.println();
		}
	}

}
