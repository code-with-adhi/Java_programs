package String;
import java.util.Scanner;

public class DecimalToHexaDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int num = sc.nextInt();
		StringBuffer s = new StringBuffer();
		
		while(num>0)
		{
			int rem = num%16;
			if(rem<9)
				s.append(rem);
			else
				s.append((char)(rem+55));
			num/=16;
		}
		
		System.out.println(s.reverse());
	}

}
