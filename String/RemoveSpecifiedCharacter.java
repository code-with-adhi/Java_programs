package String;
import java.util.Scanner; 

public class RemoveSpecifiedCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = new String();
		System.out.println("Enter String: ");
		s = sc.next();
		System.out.println("Enter character to be removed: ");
		char ch = sc.next().charAt(0);	
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				{
				remove(s,ch);
				flag=true;
				break;
				}
		}
		if(!flag)
		{
			System.out.println("Character not in string");
		}
	}
	
	public static void remove(String s,char ch)
	{
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=ch)
				res+=s.charAt(i);
		}
		System.out.println(res);
	}

}
