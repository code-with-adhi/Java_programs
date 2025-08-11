package Patterns;

public class Pattern {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print(ch+" ");
				else
					System.out.print((i+j)+" ");
				ch++;
				
			}
		
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
