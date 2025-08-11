package Patterns;

public class DiamondPattern {
	public static void main(String[] args)
	{
		int num=5;
		for (int row = 1; row <= 2 * num - 1; row++) {
			int forspace = row<num ? num-row:row-num;
			int forstar = row<num ? row : 2*num-row;
			for(int space=1;space<=forspace;space++)
				System.out.print(" ");
			for(int star=1;star<=forstar;star++)
				System.out.print("* ");
			System.out.println();
		    
		    }
		}
}

