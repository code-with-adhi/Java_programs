package String;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal value: ");
		int num = sc.nextInt();
		StringBuffer s = new StringBuffer();
		while(num>0)
		{
			int rem = num%2;
			s.append(rem);
			num/=2;
		}
		System.out.println(s.reverse());
	}

}
