package String;
import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter binary number: ");
		String num = sc.next();
		int sum=0;
		int size=num.length()-1;
		for(int i=0;i<num.length();i++)
		{
			sum+=(int)((num.charAt(size--)-48)*Math.pow(2, i));
		}
		System.out.println(sum);
		
	}

}
