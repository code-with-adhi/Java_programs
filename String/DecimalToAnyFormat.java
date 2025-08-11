package String;
import java.util.Scanner;

public class DecimalToAnyFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter radix: \n (2)Binary \n (8)Octal \n (16)HexaDecimal");
		int radix = sc.nextInt();
		
		StringBuffer s = new StringBuffer();
		if(radix==2 || radix==8)
		{
		while(num>0)
		{
			int rem=num%radix;
			s.append(rem);
			num/=radix;
		}
		}
		else
		{
			while(num>0)
			{
				int rem = num%16;
				if(rem<9)
					s.append(rem);
				else
					s.append((char)(rem+55));
				num/=16;
			}
		}
		System.out.println(s.reverse());
	}

}
