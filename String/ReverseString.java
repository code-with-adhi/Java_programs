package String;

public class ReverseString {
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(reverse(s1));
	}
	
	public static String reverse(String s1)
	{
		String s2="";
		for(int i = s1.length()-1;i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		return s2;
	}

}
