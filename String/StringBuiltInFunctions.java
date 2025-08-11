package String;
import java.util.Arrays;

public class StringBuiltInFunctions {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "hello";
		System.out.println(s1.toString());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.hashCode());
		
		char[] ch = s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(2));
		
		String s3 =" Hello ";
		System.out.println(s3.trim());
		
		String s4 = "HELLO";
		String s5 = "hello";
		System.out.println(s4.toLowerCase());
		System.out.println(s5.toUpperCase());
		
		System.out.println(s4.concat(s5));
		
	}

}
