package String;

public class ReplaceCharFromUpperToLower {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("HELLO");
		StringBuilder s2 = new StringBuilder();
		for(int i=0;i<=s1.length()-1;i++)
		{
			s2.append((char)(s1.charAt(i)+32));
		}
		System.out.println(s2);
		
	}

}
