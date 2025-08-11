package String;
import java.util.Scanner;

public class BalancedBrackets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter bracket string: ");
		s=sc.next();
		
		int counts=0,countc=0,counta=0,countp=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='{')
				countc++;
			else if(ch=='}')
				countc--;
			else if(ch=='<')
				counta++;
			else if(ch=='>')
				counta--;
			else if(ch=='(')
				countp++;
			else if(ch==')')
				countp--;
			else if(ch=='[')
				counts++;
			else if(ch==']')
				counts--;
		}
		if(countc==0&&counta==0&&countp==0&&counts==0)
			System.out.println("Balanced brackets");
		else
			System.out.println("Not balanced brackets");
	}

}
