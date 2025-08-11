package String;
import java.util.Scanner;

public class HexaDecimalToDecimal {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter HexaDecimal value: ");
		String num = sc.next();
		
		int sum=0;
		int size=num.length()-1;
		for(int i=0;i<num.length();i++)
		{
			if(num.charAt(size)>=65 && num.charAt(size)<=70)
				sum+=(int)((num.charAt(size--)-55)*Math.pow(16, i));
			else
				sum+=(int)((num.charAt(size--)-48)*Math.pow(16, i));
		}
		System.out.println(sum);
	}

}
