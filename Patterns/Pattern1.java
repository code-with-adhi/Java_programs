package Patterns;

public class Pattern1 {public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <= n*2-1; i++) {
		for(int j=1;j<=5;j++)
		{
			System.out.print(i<=n ? i>=j || i+j>=2*n ? "* ":" ":i<=j || i+j<=2*n ? "* ":" ");
		}
		System.out.println();
		
	}
}
	

}
